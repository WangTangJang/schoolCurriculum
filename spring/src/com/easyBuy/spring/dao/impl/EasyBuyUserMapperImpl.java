package com.easyBuy.spring.dao.impl;

import com.easyBuy.spring.dao.EasyBuyUserMapper;
import org.springframework.stereotype.Repository;


@Repository
public class EasyBuyUserMapperImpl implements EasyBuyUserMapper {
    @Override
    public void save() {
        System.out.println("用户已保存");
    }

    @Override
    public void findAll() {

    }
}
