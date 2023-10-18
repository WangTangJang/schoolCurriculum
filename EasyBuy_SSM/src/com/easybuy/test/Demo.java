package com.easybuy.test;

import com.easybuy.mapper.EasyBuyProductCategoryMapper;
import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.pojo.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyProductCategoryService;
import com.easybuy.service.impl.EasyBuyProductCategoryServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;


public class Demo {


    ApplicationContext applicationContext;
    EasyBuyProductCategoryService easyBuyProductCategoryService;
    private SqlSession sqlSession;

    @Before
    public void init(){
        applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        easyBuyProductCategoryService = (EasyBuyProductCategoryService) applicationContext.getBean("easyBuyProductCategoryServiceImpl");
        sqlSession = (SqlSession) applicationContext.getBean("sqlSessionTemplate"); // 初始化sqlSession对象

    }

    @Test
    public void demo(){
        int cid = 2;  // 替换为你想要查询的分类ID
        int start = 1; // 替换为分页起始位置
        int end = 10;  // 替换为分页结束位置

        // 执行SQL语句
        List<EasyBuyProduct> productList = sqlSession.selectList("com.easybuy.mapper.EasyBuyProductMapper.findByCid", cid, new RowBounds(start, end));

        // 打印产品列表
        for (EasyBuyProduct product : productList) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getTitle());
        }
    }
}
