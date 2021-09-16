package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;

public interface CustomerService {
    PageVo<Customer> getCustomerList();
}
