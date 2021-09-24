package com.sy.watersupplysystem.service.impl;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SalaryVo;
import com.sy.watersupplysystem.mapper.WorkerMapper;
import com.sy.watersupplysystem.service.WorkerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WorkerServiceImpl implements WorkerService {

    @Resource
    private WorkerMapper workerMapper;
    @Override
    public PageVo<Worker> getWorkerList(Integer currentPage) {
        PageVo<Worker> pageVo = new PageVo<>();

        int totalNum = workerMapper.getWorkerTotal();
        pageVo.setTotalNum(totalNum);
        pageVo.setStartIndex((currentPage-1) * pageVo.getPageSize());
        pageVo.setCurrentPage(currentPage);
        pageVo.setTotalPage((totalNum + pageVo.getPageSize() - 1) / pageVo.getPageSize());
        List<Worker> workers = workerMapper.getWorkerList(pageVo);

        pageVo.setResultData(workers);
        pageVo.setCode(200);
        return pageVo;
    }

    @Override
    public PageVo addWorker(Worker worker) {
       int result = workerMapper.addWorker(worker);
        PageVo pageVo = new PageVo();
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public Worker getWorkerById(Integer wid) {
        Worker worker = workerMapper.getWorkerById(wid);
        return worker;
    }

    @Override
    public PageVo updateWorker(Worker worker) {
        int result = workerMapper.updateWorker(worker);
        PageVo pageVo = new PageVo();
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public PageVo delWorker(Integer wid) {
        int result = workerMapper.delWorker(wid);
        PageVo pageVo = new PageVo();
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public void updateWorkerSalary(Integer wid,String workerSalary) {
       int result = workerMapper.updateWorkerSalary(wid,workerSalary);
    }

    @Override
    public PageVo<Worker> notSendWorker(Integer currentPage) {
        PageVo<Worker> pageVo = new PageVo<>();

        int totalNum = workerMapper.notSendWorkerTotal();
        pageVo.setTotalNum(totalNum);
        pageVo.setStartIndex((currentPage-1) * pageVo.getPageSize());
        pageVo.setCurrentPage(currentPage);
        pageVo.setTotalPage((totalNum + pageVo.getPageSize() - 1) / pageVo.getPageSize());
        List<Worker> workers = workerMapper.notSendWorker(pageVo);

        pageVo.setResultData(workers);
        pageVo.setCode(200);
        return pageVo;
    }

    @Override
    public List<Worker> getWorkers() {
        return workerMapper.getWorkers();

    }

    @Override
    public PageVo getWorkerSalary(SalaryVo salaryVo) {
        PageVo<SalaryVo> pageVo = new PageVo<>();
        List<SalaryVo> workerSalary = workerMapper.getWorkerSalary(salaryVo);
        if (workerSalary != null){
            pageVo.setCode(200);
            pageVo.setResultData(workerSalary);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

}
