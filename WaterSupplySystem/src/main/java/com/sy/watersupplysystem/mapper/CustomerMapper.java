package com.sy.watersupplysystem.mapper;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getCustomerList(PageVo pageVo);

    int addCustomer(Customer customer);

    Customer getCustomerById(Integer cid);

    int updateCustomer(Customer customer);

    int delCustomer(Integer cid);

    int getCustomerTotal();

    List<Customer> getCustomers();
}
