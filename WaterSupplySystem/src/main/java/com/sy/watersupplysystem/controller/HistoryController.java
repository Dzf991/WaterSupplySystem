package com.sy.watersupplysystem.controller;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.History;
import com.sy.watersupplysystem.entities.Worker;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SendHistory;
import com.sy.watersupplysystem.service.CustomerService;
import com.sy.watersupplysystem.service.HistoryService;
import com.sy.watersupplysystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;
    @Autowired
    private WorkerService workerService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/goHistoryList")
    public String goHistoryList(Model model,Integer currentPage){
        model.addAttribute("currentPage",currentPage);
        return "history/historyList";
    }
    @GetMapping("/goHistoryUpdate")
    public String goHistoryUpdate(Model model,Integer currentPage,Integer hid){
        model.addAttribute("currentPage",currentPage);
        History history = historyService.getHistoryById(hid);
        model.addAttribute("history",history);
        List<Worker> workers = workerService.getWorkers();
        model.addAttribute("worker",workers);
        List<Customer> customers =customerService.getCustomers();
        model.addAttribute("customer",customers);
        return "history/historyUpdate";
    }
    @GetMapping("/goHistoryAdd")
    public String goHistoryList(Model model){
        List<Worker> workers = workerService.getWorkers();
        model.addAttribute("worker",workers);
        List<Customer> customers =customerService.getCustomers();
        model.addAttribute("customer",customers);
        return "history/historyAdd";
    }

    @ResponseBody
    @GetMapping("/getHistoryList")
    public Object getHistoryList(Model model,Integer currentPage,SendHistory sendHistory){
        PageVo<History> historyPageVo = historyService.getHistoryList(currentPage,sendHistory);
        model.addAttribute("currentPage",currentPage);
        return historyPageVo;
    }

    @ResponseBody
    @GetMapping(value = "/delChecked")
    public Object delChecked(Integer[] hids){
        PageVo<History> historyPageVo = historyService.delChecked(hids);
        return historyPageVo;
    }

    @ResponseBody
    @GetMapping(value = "/delHistory")
    public Object delChecked(Integer hid){
        PageVo<History> historyPageVo = historyService.delHistory(hid);
        return historyPageVo;
    }
    @ResponseBody
    @PostMapping(value = "/addHistory")
    public Object addHistory(History history){
        PageVo<History> historyPageVo = historyService.addHistory(history);
        return historyPageVo;
    }
    @ResponseBody
    @PostMapping(value = "/updateHistory")
    public Object updateHistory(History history){
        PageVo<History> historyPageVo = historyService.updateHistory(history);
        return historyPageVo;
    }
}
