package com.sy.watersupplysystem.service.impl;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
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
    public PageVo<Worker> getWorkerList() {
        PageVo<Worker> pageVo = new PageVo<>();
        List<Worker> workers = workerMapper.getWorkerList();
        pageVo.setResultData(workers);
        pageVo.setCode(200);
        return pageVo;
    }
}
