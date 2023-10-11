package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyUser;
import com.easybuy.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
