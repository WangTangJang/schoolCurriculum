package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EasyBuyProductController {

    @Autowired
    EasyBuyProductService easyBuyProductService;

    @RequestMapping("getProductById")
    public String  getProductById(int id, HttpServletRequest request){
        EasyBuyProduct easyBuyProduct = easyBuyProductService.findById(id);
        request.setAttribute("ep",easyBuyProduct);
        return "product-view";
    }
}
