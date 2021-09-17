package com.sy.watersupplysystem.service.impl;

import com.sy.watersupplysystem.entities.Customer;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.mapper.CustomerMapper;
import com.sy.watersupplysystem.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public PageVo<Customer> getCustomerList() {
        PageVo<Customer> pageVo = new PageVo<>();
        List<Customer> customers = customerMapper.getCustomerList();
        if (customers != null){
            pageVo.setCode(200);
            pageVo.setResultData(customers);
            return pageVo;
        }else {
            pageVo.setCode(404);
            return pageVo;
        }
    }

    @Override
    public PageVo addCustomer(Customer customer) {

        PageVo pageVo = new PageVo();
        int result = customerMapper.addCustomer(customer);
        if (result > 0 ){
            pageVo.setCode(200);
            return pageVo;
        }else {
            pageVo.setCode(400);
            return pageVo;
        }

    }

    @Override
    public Customer getCustomerById(Integer cid) {
        Customer customer = customerMapper.getCustomerById(cid);

        return customer;
    }
}
