package com.easyBuy.mybatis.test;

import com.easyBuy.mybatis.mapper.EasyBuyUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public  class EasyBuyUserMapperTest {

    EasyBuyUserMapper easyBuyUserMapper;
    SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        sqlSession = sqlSessionFactory.openSession();

        easyBuyUserMapper = sqlSession.getMapper(EasyBuyUserMapper.class);

    }

    @Test
    public void count() throws Exception {
        int count = easyBuyUserMapper.count();
        System.out.println(count);
    }

    @Test
    public void findAll() {
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
}