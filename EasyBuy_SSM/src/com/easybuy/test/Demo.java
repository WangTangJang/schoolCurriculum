package com.easybuy.test;

import com.easybuy.mapper.EasyBuyProductCategoryMapper;
import com.easybuy.pojo.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyProductCategoryService;
import com.easybuy.service.impl.EasyBuyProductCategoryServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Demo {


    ApplicationContext applicationContext;
    EasyBuyProductCategoryService easyBuyProductCategoryService;

    @Before
    public void init(){
        applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        easyBuyProductCategoryService = (EasyBuyProductCategoryService) applicationContext.getBean("easyBuyProductCategoryServiceImpl");
    }

    @Test
    public void demo(){
        Map<String, List<EasyBuyProductCategory>> map = easyBuyProductCategoryService.getProductCategoryByParentId(1);
        System.out.println(map.toString());
        System.out.println(map.keySet());
    }
}
