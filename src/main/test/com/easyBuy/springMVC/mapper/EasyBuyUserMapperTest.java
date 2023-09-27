package com.easyBuy.springMVC.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EasyBuyUserMapperTest {


    @Test
    public void count() {
    }

    @Test
    public void findAll() throws Exception {
        ApplicationContext ap = new ClassPathXmlApplicationContext("/applicationContext.xml");
        EasyBuyUserMapper easyBuyUserMapper = (EasyBuyUserMapper) ap.getBean("easyBuyUserMapper");
        easyBuyUserMapper.findAll();
    }

    @Test
    public void login() {
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
    public void findByWhere() {
    }

    @Test
    public void findByWhere2() {
    }

    @Test
    public void modify2() {
    }

    @Test
    public void modify3() {
    }

    @Test
    public void findByWhere3() {
    }

    @Test
    public void findByWhere4() {
    }
}