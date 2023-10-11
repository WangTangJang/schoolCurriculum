package com.easyBuy.spring.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EasyBuyServiceImplTest {

    ApplicationContext applicationContext;
    EasyBuyServiceImpl easyBuyService;

    @Before
    public void init(){
        applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        easyBuyService = (EasyBuyServiceImpl) applicationContext.getBean("easyBuyServiceImpl");
    }
    @Test
    public void save() {
        easyBuyService.save();
    }

    @Test
    public void findAll() {
    }
}