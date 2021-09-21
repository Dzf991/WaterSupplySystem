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
    public PageVo<Customer> getCustomerList(Integer currentPage) {
        PageVo<Customer> pageVo = new PageVo<>();
        pageVo.setCurrentPage(currentPage);

        int totalNum = customerMapper.getCustomerTotal();
        pageVo.setTotalNum(totalNum);
        pageVo.setTotalPage((totalNum + pageVo.getPageSize() - 1) / pageVo.getPageSize() );
        pageVo.setStartIndex((currentPage-1) * pageVo.getPageSize());
        List<Customer> customers = customerMapper.getCustomerList(pageVo);
        if (customers != null){
            pageVo.setCode(200);
            pageVo.setResultData(customers);
        }else {
            pageVo.setCode(404);
        }
        return pageVo;
    }

    @Override
    public PageVo addCustomer(Customer customer) {

        PageVo pageVo = new PageVo();
        int result = customerMapper.addCustomer(customer);
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;

    }

    @Override
    public Customer getCustomerById(Integer cid) {
        Customer customer = customerMapper.getCustomerById(cid);

        return customer;
    }

    @Override
    public PageVo updateCustomer(Customer customer) {
        PageVo pageVo = new PageVo();
        int result = customerMapper.updateCustomer(customer);
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public PageVo delCustomer(Integer cid) {
        PageVo pageVo = new PageVo();
        int result = customerMapper.delCustomer(cid);
        if (result > 0 ){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerMapper.getCustomers();
    }
}
