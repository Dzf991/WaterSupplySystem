package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.Account;
import com.sy.watersupplysystem.entities.vo.PageVo;

public interface AccountService {
    Account login(Account account);

    PageVo<Account> register(Account account);
}
