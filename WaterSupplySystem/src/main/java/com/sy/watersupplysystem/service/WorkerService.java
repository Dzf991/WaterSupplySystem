package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;

import java.util.List;

public interface WorkerService {
     PageVo<Worker> getWorkerList(Integer currentPage);

    PageVo addWorker(Worker worker);

    Worker getWorkerById(Integer wid);

    PageVo updateWorker(Worker worker);

    PageVo delWorker(Integer wid);

    void updateWorkerSalary(Integer wid,String workerSalary);

    PageVo<Worker> notSendWorker(Integer currentPage);

    List<Worker> getWorkers();
}
