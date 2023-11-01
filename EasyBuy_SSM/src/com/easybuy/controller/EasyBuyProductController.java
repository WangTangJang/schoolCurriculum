package com.easybuy.controller;

import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.service.EasyBuyNewsService;
import com.easybuy.service.EasyBuyProductService;
import javafx.scene.chart.ValueAxis;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Random;

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

        int count=easyBuyProductService.countProduct();
        /**
         * 总页数
         */
        int pages=(count%size)>0?(count/size)+1:count/size;

        request.setAttribute("pages",pages);
        request.setAttribute("page",page);
        request.setAttribute("list",list);
        return "manage/product";
    }

    @RequestMapping("toAdminAddProduct")
    public String toAdminAddProduct(){
        return "manage/product-add";
    }


    @RequestMapping("doProductAdd")
    public String doProductAdd(HttpServletRequest request,EasyBuyProduct ep, @RequestParam(value = "pic",required = false) MultipartFile attach){

        String idPicPath = null;
        //判断文件是否为空
        if(!attach.isEmpty()) {
            String path="D:\\apache-tomcat-8.5.9\\webapps\\jd\\";
            String oldFileName = attach.getOriginalFilename();//原文件名
            String prefix= FilenameUtils.getExtension(oldFileName);//原文件后缀
            int filesize = 500000;
            if(attach.getSize() >  filesize) {//上传大小不得超过 500k
                request.setAttribute("uploadFileError", " * 上传大小不得超过 500k");
                return "manage/product-add";
            }else if(prefix.equalsIgnoreCase("jpg") || prefix.equalsIgnoreCase("png")
                    || prefix.equalsIgnoreCase("jpeg") || prefix.equalsIgnoreCase("pneg")) {//上传图片格式不正确
                Random r=new Random();
                int num=r.nextInt(100000);
                String fileName = System.currentTimeMillis() + num + "_Personal.jpg";
                File targetFile = new File(path, fileName);
                if (!targetFile.exists()) {
                    targetFile.mkdirs();
                }
                //保存
                try {
                    attach.transferTo(targetFile);
                } catch (Exception e) {
                    e.printStackTrace();
                    request.setAttribute("uploadFileError", " * 上传失败！");
                    return "manage/product-add";
                }
                idPicPath = path+File.separator+fileName;
                ep.setCreated(new Date());
                ep.setStatus(1);
                ep.setImage("http://127.0.0.1:9090/jd/"+fileName);
            }
            else{
                request.setAttribute("uploadFileError", " * 上传图片格式不正确");
                return "manage/product-add";
            }
        }
        easyBuyProductService.save(ep);
        return "redirect:/toAdminProduct";

    }
    @RequestMapping("toProductModify")
    public String toProductModify(int id,HttpServletRequest request){
        EasyBuyProduct ep=easyBuyProductService.findProductById(id);
        request.setAttribute("ep",ep);
        return "manage/product-modify";
    }
    @RequestMapping("doProductModify")
    public String doProductModify(HttpServletRequest request,String oldpic,EasyBuyProduct ep, @RequestParam(value = "pic",required = false) MultipartFile attach){

        String idPicPath = null;
        //判断文件是否为空
        if(!attach.isEmpty()) {
            String path="D:\\apache-tomcat-8.5.9\\webapps\\jd\\";
            String oldFileName = attach.getOriginalFilename();//原文件名
            String prefix= FilenameUtils.getExtension(oldFileName);//原文件后缀
            int filesize = 500000;
            if(attach.getSize() >  filesize) {//上传大小不得超过 500k
                request.setAttribute("uploadFileError", " * 上传大小不得超过 500k");
                return "manage/product-modify";
            }else if(prefix.equalsIgnoreCase("jpg") || prefix.equalsIgnoreCase("png")
                    || prefix.equalsIgnoreCase("jpeg") || prefix.equalsIgnoreCase("pneg")) {//上传图片格式不正确
                Random r=new Random();
                int num=r.nextInt(100000);
                String fileName = System.currentTimeMillis() + num + "_Personal.jpg";
                File targetFile = new File(path, fileName);
                if (!targetFile.exists()) {
                    targetFile.mkdirs();
                }
                //保存
                try {
                    attach.transferTo(targetFile);
                } catch (Exception e) {
                    e.printStackTrace();
                    request.setAttribute("uploadFileError", " * 上传失败！");
                    return "manage/product-modify";
                }
                idPicPath = path+File.separator+fileName;
                ep.setStatus(1);
                ep.setUpdated(new Date());
                ep.setImage("http://127.0.0.1:9090/jd/"+fileName);
            }
            else{
                request.setAttribute("uploadFileError", " * 上传图片格式不正确");
                return "manage/product-modify";
            }
        }else
        {
            ep.setUpdated(new Date());
            ep.setImage(oldpic);
        }
        easyBuyProductService.modify(ep);

        return "redirect:/toAdminProduct";

    }
    @RequestMapping("doProductDelete")
    public String doProductDelete(int id)
    {
        easyBuyProductService.delete(id);
        return "redirect:/toAdminProduct";
    }

}