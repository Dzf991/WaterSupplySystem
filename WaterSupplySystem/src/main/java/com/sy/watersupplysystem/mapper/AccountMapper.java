package com.sy.watersupplysystem.mapper;

import com.sy.watersupplysystem.entities.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    Account login(Account account);

    int register(Account account);
}
