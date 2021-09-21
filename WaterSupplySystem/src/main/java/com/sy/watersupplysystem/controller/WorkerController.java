package com.sy.watersupplysystem.controller;

import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;
    @Value(value = "${location}")
    private String imagePath;


    @GetMapping(value = "/goWorkerAdd")
    public String goWorkerAdd(){
        return "worker/workerAdd";
    }

    @GetMapping(value = "/goWorkerUpdate")
    public String goWorkerUpdate(Model model, Integer wid,Integer currentPage){

       Worker worker = workerService.getWorkerById(wid);
       model.addAttribute("currentPage",currentPage);
       model.addAttribute("worker",worker);
       return "worker/workerUpdate";
    }


    @GetMapping(value = "/goWorkerList")
    public String goWorkerList(Model model, Integer currentPage){
        model.addAttribute("currentPage",currentPage);
        return "worker/workerList";
    }


    @GetMapping(value = "/getWorkerList")
    @ResponseBody
    public Object getWorkerList(Integer currentPage){
        PageVo<Worker> workers = workerService.getWorkerList(currentPage);
        return workers;
    }

    @GetMapping(value = "/notSendWorker")
    @ResponseBody
    public Object notSendWorker(Integer currentPage){
        PageVo<Worker> workers = workerService.notSendWorker(currentPage);
        return workers;
    }

    @PostMapping(value = "/addWorker")
    @ResponseBody
    public Object addWorker(Worker worker , MultipartFile image) throws IOException {

        long prefix = System.currentTimeMillis();
        if (!image.isEmpty()){
            String fileName = image.getOriginalFilename();
            int indexOf = fileName.lastIndexOf(".");
            String suffix = fileName.substring(indexOf);
            System.out.println(fileName);
            fileName = prefix + suffix;
            System.out.println(fileName);
            File parentPath = new File(imagePath);
            if (!parentPath.exists()){
                parentPath.mkdirs();
            }
            File file = new File(parentPath,fileName);
            image.transferTo(file);
            worker.setWorkerImage(fileName);
        }
        PageVo result = workerService.addWorker(worker);
        return result;
    }

    @PostMapping(value = "/updateWorker")
    @ResponseBody
    public Object updateWorker(Worker worker , MultipartFile image) throws IOException {

        long prefix = System.currentTimeMillis();
        if (!image.isEmpty()){
            String fileName = image.getOriginalFilename();
            int indexOf = fileName.lastIndexOf(".");
            String suffix = fileName.substring(indexOf);
            System.out.println(fileName);
            fileName = prefix + suffix;
            System.out.println(fileName);
            File parentPath = new File(imagePath);
            if (!parentPath.exists()){
                parentPath.mkdirs();
            }
            File file = new File(parentPath,fileName);
            image.transferTo(file);
            worker.setWorkerImage(fileName);
        }
        PageVo result = workerService.updateWorker(worker);
        return result;
    }


    @ResponseBody
    @GetMapping(value = "/delWorker")
    public Object delWorker(Integer wid){
        PageVo result =workerService.delWorker(wid);
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/updateWorkerSalary")
    public void updateWorkerSalary(Integer wid, String workerSalary){
        workerService.updateWorkerSalary(wid,workerSalary);
    }
}
