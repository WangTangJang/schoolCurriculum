package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyUser;
import com.easybuy.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.CharacterEncodingFilter;

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

    @RequestMapping("/toReg")
    public String toReg(){
        return "register";
    }

    @RequestMapping("/doReg")
    public String doReg(EasyBuyUser eu)
    {
        CharacterEncodingFilter fd;
        int r=easyBuyUserService.save(eu);
        return "redirect:toLogin";

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

    @RequestMapping("toAdminUser")
    public String toAdminUser(HttpServletRequest request, @RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "size",defaultValue = "7") int size)
    {
        try {
            List list=easyBuyUserService.findAll(page,size);

            int count=easyBuyUserService.count();


            int pages=  (count%size==0)?count/size:(count/size)+1;


            request.setAttribute("pages",pages);

            request.setAttribute("list",list);
            request.setAttribute("page",page);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return "manage/user";


    }


}
