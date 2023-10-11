package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyNews;
import com.easybuy.service.EasyBuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EasyBuyNewsController {
    @Autowired
    EasyBuyNewsService easyBuyNewsService;

    @RequestMapping("getNewsById")
    public String getNewsById(int id, HttpServletRequest request){
        EasyBuyNews easyBuyNews = easyBuyNewsService.getEasyBuyNewById(id);
        request.setAttribute("en",easyBuyNews);
        return "news-view";
    }
}
