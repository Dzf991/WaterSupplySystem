package com.sy.watersupplysystem.service.impl;

import cn.hutool.db.Page;
import com.sy.watersupplysystem.entities.Account;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.mapper.AccountMapper;
import com.sy.watersupplysystem.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account login(Account account) {

       Account account1 = accountMapper.login(account);
       return account1;
    }

    @Override
    public PageVo<Account> register(Account account) {
        PageVo pageVo = new PageVo();
        int result = accountMapper.register(account);

        if (result > 0){
           pageVo.setCode(200);
           return pageVo;
       }
        return null;
    }
}
