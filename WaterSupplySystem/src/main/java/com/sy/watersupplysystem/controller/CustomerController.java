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
    public String goCustomerMenu(){
        return "customer/CustomerList";
    }



    @GetMapping(value = "/goAdd")
    public String goCustomerAdd(){
        return "customer/customerAdd";
    }

    @GetMapping(value = "/goUpdate")
    public String goCustomerUpdate(Model model, Integer cid){

        Customer customer = customerService.getCustomerById(cid);
        model.addAttribute("customer",customer);
        return "customer/customerAdd";
    }

    @GetMapping(value = "/getCustomerList")
    @ResponseBody
    public Object getCustomerList(){
        PageVo<Customer> customers = customerService.getCustomerList();
        return customers;
    }

    @PostMapping(value = "/addCustomer")
    @ResponseBody
    public Object addCustomer(Customer customer){
       PageVo pageVo = customerService.addCustomer(customer);
        return pageVo;
    }
}
