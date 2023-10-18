package com.easybuy.test;

import com.easybuy.mapper.EasyBuyProductCategoryMapper;
import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.pojo.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyProductCategoryService;
import com.easybuy.service.EasyBuyProductService;
import com.easybuy.service.impl.EasyBuyProductCategoryServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Demo {


    ApplicationContext applicationContext;
    EasyBuyProductCategoryService easyBuyProductCategoryService;
    EasyBuyProductService easyBuyProductService;
    private SqlSession sqlSession;

    @Before
    public void init(){
        applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        easyBuyProductCategoryService = (EasyBuyProductCategoryService) applicationContext.getBean("easyBuyProductCategoryServiceImpl");
        sqlSession = (SqlSession) applicationContext.getBean("sqlSessionTemplate"); // 初始化sqlSession对象
        easyBuyProductService = (EasyBuyProductService) applicationContext.getBean("easyBuyProductServiceImpl");
    }

    @Test
    public void demo2(){
        easyBuyProductService.findProductByCid(2,1,10);
    }

    @Test
    public void demo1(){
        int cid = 2;  // 替换为你想要查询的分类ID
        int start = 0;  // 起始位置
        int end = 30; // 返回的记录数量

        Map<String, Integer> params = new HashMap<>();
        params.put("cid", cid);
        params.put("start", start);
        params.put("end", end);

        // 执行SQL语句
        List<EasyBuyProduct> productList = sqlSession.selectList("findByCid",params);

        // 打印产品列表
        for (EasyBuyProduct product : productList) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getTitle());
        }
    }
}
