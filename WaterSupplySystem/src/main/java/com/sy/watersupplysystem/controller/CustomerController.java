package com.sy.watersupplysystem.controller;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/goCustomerList")
    public String goCustomerList(Model model, Integer currentPage){
        model.addAttribute("currentPage",currentPage);
        return "customer/customerList";
    }



    @GetMapping(value = "/goCustomerAdd")
    public String goCustomerAdd(){
        return "customer/customerAdd";
    }

    @GetMapping(value = "/goCustomerUpdate")
    public String goCustomerUpdate(Model model, Integer cid, Integer currentPage){

        Customer customer = customerService.getCustomerById(cid);
        model.addAttribute("customer",customer);
        model.addAttribute("currentPage",currentPage);
        return "customer/customerUpdate";
    }

    @GetMapping(value = "/getCustomerList")
    @ResponseBody
    public Object getCustomerList(Model model, Integer currentPage){
        PageVo<Customer> customerPageVo = customerService.getCustomerList(currentPage);
        model.addAttribute("pageVo",customerPageVo);
        return customerPageVo;
    }

    @PostMapping(value = "/addCustomer")
    @ResponseBody
    public Object addCustomer(Customer customer){
       PageVo pageVo = customerService.addCustomer(customer);
        return pageVo;
    }

    @PostMapping(value = "/updateCustomer")
    @ResponseBody
    public Object updateCustomer(Customer customer){
        PageVo pageVo = customerService.updateCustomer(customer);
        return pageVo;
    }
    @GetMapping(value = "/delCustomer")
    @ResponseBody
    public Object delCustomer(Integer cid){
        PageVo pageVo = customerService.delCustomer(cid);

        return pageVo;
    }
}
