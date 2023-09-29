package com.easyBuy.springMVC.mapper;

import com.easyBuy.springMVC.pojo.EasyBuyUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EasyBuyUserMapperTest {


    @Test
    public void count() {
    }

    @Test
    public void findAll() throws Exception {
        ApplicationContext ap = new ClassPathXmlApplicationContext("/applicationContext.xml");
        EasyBuyUserMapper easyBuyUserMapper = (EasyBuyUserMapper) ap.getBean("easyBuyUserMapper");
        List<EasyBuyUser> easyBuyUsers = easyBuyUserMapper.findAll();
        for(EasyBuyUser e:easyBuyUsers){
            System.out.println(e);
        }
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