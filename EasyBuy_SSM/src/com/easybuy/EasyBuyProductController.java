package com.easybuy;

import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.service.EasyBuyNewsService;
import com.easybuy.service.EasyBuyProductService;
import javafx.scene.chart.ValueAxis;
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
    public String getProductById(int id,HttpServletRequest request)
    {
        EasyBuyProduct ep=easyBuyProductService.findProductById(id);
        request.setAttribute("ep",ep);
        return "product-view";
    }

    @RequestMapping("getProductByCid")
    public String getProductByCId(int cid, @RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "size",defaultValue = "12") int size, HttpServletRequest request)
    {
        List list=easyBuyProductService.findProductBycid(cid,page,size);
        request.setAttribute("list",list);
        request.setAttribute("page",page);
        int count=easyBuyProductService.countProductByCid(cid);
        /**
         * 总页数
         */
        int pages=(count%size)>0?(count/size)+1:count/size;

        request.setAttribute("pages",pages);

        return "product-list";
    }

    @RequestMapping("toAdminProduct")
    public String toAdminProduct( @RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "size",defaultValue = "7") int size, HttpServletRequest request)
    {
        List list=easyBuyProductService.findProductByPage(page,size);

        request.setAttribute("list",list);
        return "manage/product";
    }

}