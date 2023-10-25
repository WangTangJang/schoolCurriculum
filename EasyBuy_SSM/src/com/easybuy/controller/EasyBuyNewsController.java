package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyNews;
import com.easybuy.service.EasyBuyNewsService;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EasyBuyNewsController {

    @Autowired
    EasyBuyNewsService easyBuyNewsService;

    @RequestMapping("getNewsById")
    public String getNewsById(int id,HttpServletRequest request)
    {
        EasyBuyNews en=easyBuyNewsService.getEasyBuyNewsById(id);
        request.setAttribute("en",en);
        return "news-view";
    }
    @RequestMapping("toAdminNews")
    public String toAdminNews(HttpServletRequest request, @RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "size",defaultValue = "7") int size)
    {
        try {
            List list=easyBuyNewsService.findNewsByPage(page,size);

            int count=easyBuyNewsService.count();


            int pages=  (count%size==0)?count/size:(count/size)+1;


            request.setAttribute("pages",pages);

            request.setAttribute("list",list);
            request.setAttribute("page",page);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return "manage/news";

    }

}