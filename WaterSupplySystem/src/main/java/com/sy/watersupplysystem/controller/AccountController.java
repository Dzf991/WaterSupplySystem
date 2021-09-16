package com.sy.watersupplysystem.controller;


import cn.hutool.Hutool;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.MD5;
import com.sy.watersupplysystem.entities.Account;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping(value = "/account/goRegister")
    public String goRegister(){
        return "register";
    }
    @ResponseBody
    @PostMapping(value = "/account/register")
    public Object register(Account account){
        String pwd = DigestUtil.md5Hex(account.getUserPassword());
        account.setUserPassword(pwd);
        PageVo<Account> accountPageVo = accountService.register(account);
       return accountPageVo;
    }
    @PostMapping(value = "/login")
    public String login(Model model, Account account, HttpServletRequest request){

        String pwd = DigestUtil.md5Hex(account.getUserPassword());
        account.setUserPassword(pwd);
        Account account1 = accountService.login(account);
        if (account1 != null){
            request.getSession().setAttribute("account",account1);
            return "Menu";
        }
        model.addAttribute("loginError","用户名或密码错误!请重新输入。");
        return "index";
    }

}
