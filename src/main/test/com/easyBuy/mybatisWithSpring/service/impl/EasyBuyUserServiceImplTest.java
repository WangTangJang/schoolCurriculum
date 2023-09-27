package com.easyBuy.mybatisWithSpring.service.impl;

import com.easyBuy.mybatisWithSpring.service.EasyBuyUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EasyBuyUserServiceImplTest {

    ApplicationContext ap;
    EasyBuyUserService easyBuyUserService;
    @Before
    public void init(){
        ap = new ClassPathXmlApplicationContext("MybatisWithSpring/applicationContext.xml");
        easyBuyUserService = (EasyBuyUserService) ap.getBean("easyBuyUserServiceImpl");
    }

    @Test
    public void count() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        System.out.println(easyBuyUserService.findAll());
    }

    @Test
    public void findUserById() {
    }

    @Test
    public void save() {
    }

    @Test
    public void modify() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findUserByWhere() {
    }

    @Test
    public void findUserByLike() {
    }

    @Test
    public void modifyByTrim() {
    }

    @Test
    public void findUserByLimit() {
    }
}