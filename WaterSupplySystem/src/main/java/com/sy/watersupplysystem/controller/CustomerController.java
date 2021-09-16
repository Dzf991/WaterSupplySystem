package com.sy.watersupplysystem.controller;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/goCustomerMenu")
    public String goCustomerMenu(){
        return "CustomerMenu";
    }
    @GetMapping(value = "/getCustomerList")
    @ResponseBody
    public Object getCustomerList(){
        PageVo<Customer> customers = customerService.getCustomerList();
        return customers;
    }
}
