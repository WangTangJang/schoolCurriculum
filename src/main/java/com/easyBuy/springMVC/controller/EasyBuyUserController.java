package com.easyBuy.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EasyBuyUserController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request)
    {
        System.out.println("------------------doLogin1---------------");
        String loginName=request.getParameter("loginName");
        String password=request.getParameter("password");
        System.out.println("loginName:"+loginName);
        System.out.println("password:"+password);
        return "hello";
    }

    @RequestMapping("/doLogin2")
    public String doLogin2(String loginName,String password)
    {
        System.out.println("------------------doLogin2---------------");
        System.out.println("loginName:"+loginName);
        System.out.println("password:"+password);
        return "hello";
    }
}
