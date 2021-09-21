package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;

import java.util.List;

public interface CustomerService {
    PageVo<Customer> getCustomerList(Integer currentPage);

    PageVo addCustomer(Customer customer);

    Customer getCustomerById(Integer cid);

    PageVo updateCustomer(Customer customer);

    PageVo delCustomer(Integer cid);

    List<Customer> getCustomers();
}
