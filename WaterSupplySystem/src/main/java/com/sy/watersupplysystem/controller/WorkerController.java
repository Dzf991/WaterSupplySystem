package com.sy.watersupplysystem.controller;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping(value = "/goWorkerList")
    public String goWorkerList(){
        return "worker/workerList";
    }

    @GetMapping(value = "/getWorkerList")
    @ResponseBody
    public Object getWorkerList(){
        PageVo<Worker> workers = workerService.getWorkerList();
        return workers;
    }



}
