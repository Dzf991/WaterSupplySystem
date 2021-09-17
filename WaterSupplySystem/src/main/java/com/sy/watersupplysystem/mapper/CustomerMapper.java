package com.sy.watersupplysystem.mapper;

import com.sy.watersupplysystem.entities.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getCustomerList();

    int addCustomer(Customer customer);

    Customer getCustomerById(Integer cid);
}
