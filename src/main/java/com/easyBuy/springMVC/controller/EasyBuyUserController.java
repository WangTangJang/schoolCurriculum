package com.easyBuy.springMVC.controller;

import com.easyBuy.springMVC.pojo.EasyBuyUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "/doLogin3",method = RequestMethod.POST)
    public String doLogin3(EasyBuyUser easyBuyUser){
        System.out.println("------------------doLogin3-----------------");
        System.out.println("loginName:"+easyBuyUser.getLoginName());
        System.out.println("password:"+easyBuyUser.getPassword());
        return "hello";
    }
    @RequestMapping(value = "/doLogin5",method = RequestMethod.POST)
    public String doLogin5(@RequestParam(value = "loginName",defaultValue = "admin") String loginName, @RequestParam(value = "password",defaultValue = "321") String password)
    {
        System.out.println("------------------doLogin5---------------");
        System.out.println("loginName:"+loginName);
        System.out.println("password:"+password);
        return "hello";
    }
    @RequestMapping(value = "/doLogin6/{loginName}/{password}")
    public String doLogin6(@PathVariable("loginName") String loginName, @PathVariable("password") String password)
    {
        System.out.println("------------------doLogin6---------------");
        System.out.println("loginName:"+loginName);
        System.out.println("password:"+password);
        return "hello";
    }

}
