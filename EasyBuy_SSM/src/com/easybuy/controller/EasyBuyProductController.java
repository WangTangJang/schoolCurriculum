package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EasyBuyProductController {

    @Autowired
    EasyBuyProductService easyBuyProductService;

    @RequestMapping("getProductById")
    public String getProductById(int id, HttpServletRequest request) {
        EasyBuyProduct easyBuyProduct = easyBuyProductService.findById(id);
        request.setAttribute("ep", easyBuyProduct);
        return "product-view";
    }

    @RequestMapping("getProductByCid")
    public String getProductByCid(int cid, @RequestParam(value = "page", defaultValue = "1") int page,
                                  @RequestParam(value = "size", defaultValue = "12") int size, HttpServletRequest request) {
        List list = easyBuyProductService.findProductByCid(cid, page, size);

        int count = easyBuyProductService.countProductByCid(cid);// 获取总页数

        int pages = (count % size) > 0 ? (count / size) + 1 : (count / size);

        request.setAttribute("list", list);
        request.setAttribute("page", page);
        request.setAttribute("pages", pages);
        return "product-list";
    }
}
