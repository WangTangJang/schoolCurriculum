package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyNews;
import com.easybuy.service.EasyBuyNewsService;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class EasyBuyNewsController {


    @Autowired
    EasyBuyNewsService easyBuyNewsService;

    /**
     * 获取通过id获取新闻
     * @param id id值
     * @param request 用于传递请求信息
     * @return 一个新闻页面的地址
     */
    @RequestMapping("getNewsById")
    public String getNewsById(int id,HttpServletRequest request)
    {
        // 获取查询出来的一个新闻实体
        EasyBuyNews en=easyBuyNewsService.getEasyBuyNewsById(id);//想service层传递一个id值
        request.setAttribute("en",en); // 将获取到的新闻实体放入请求消息中
        return "news-view"; // 返回新闻详情页的地址
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
    /**
     * 打开新闻添加页面
     */
    @RequestMapping("toNewsAdd")
    public String toNewsAdd()
    {
        return "manage/news-add";
    }

    @RequestMapping("saveNews")
    public String saveNews(EasyBuyNews easyBuyNews){
        easyBuyNews.setCreateTime(new Date());
        int r=easyBuyNewsService.save(easyBuyNews);
        return "redirect:/toAdminNews";
    }
}