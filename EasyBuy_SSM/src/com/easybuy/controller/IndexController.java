package com.easybuy.controller;

import com.easybuy.service.EasyBuyNewsService;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    EasyBuyNewsService easyBuyNewsService;

    @Autowired
    EasyBuyProductService easyBuyProductService;


    @RequestMapping("/index")
    public String index(HttpServletRequest request)
    {
        List listNews=easyBuyNewsService.findNewsByPage(1,7);

        request.setAttribute("listNews",listNews);

        List listProduct=easyBuyProductService.findProductByPage(1,8);

        request.setAttribute("listProduct",listProduct);

        return "index";
    }

}