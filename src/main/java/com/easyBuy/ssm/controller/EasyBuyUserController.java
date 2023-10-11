package com.easyBuy.ssm.controller;

import com.easyBuy.ssm.pojo.EasyBuyUser;
import com.easyBuy.ssm.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EasyBuyUserController {

    @Autowired
    EasyBuyUserService easyBuyUserService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(EasyBuyUser easyBuyUser, HttpServletRequest request)
    {
        try {
            EasyBuyUser eu=easyBuyUserService.login(easyBuyUser.getLoginName(),easyBuyUser.getPassword());

            if(eu==null)
            {
                request.setAttribute("MSG","用户名或者密码错误!");
                return "login";
            }else
            {
                request.getSession().setAttribute("EU",eu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/index";
    }



}
