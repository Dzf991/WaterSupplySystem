package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;

public interface WorkerService {
     PageVo<Worker> getWorkerList();
}
