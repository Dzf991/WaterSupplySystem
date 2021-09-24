package com.sy.watersupplysystem.mapper;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SalaryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerMapper {
    List<Worker> getWorkerList(PageVo pageVo);

    int addWorker(Worker worker);

    Worker getWorkerById(Integer wid);

    int updateWorker(Worker worker);

    int delWorker(Integer wid);

    int updateWorkerSalary(@Param(value = "wid") Integer wid,
                           @Param(value = "workerSalary") String workerSalary);

    int getWorkerTotal();

    List<Worker> notSendWorker(PageVo<Worker> pageVo);

    int notSendWorkerTotal();

    List<Worker> getWorkers();

    List<SalaryVo> getWorkerSalary(SalaryVo salaryVo);
}
