package com.easyBuy.spring.service.impl;

import com.easyBuy.spring.dao.EasyBuyUserMapper;
import com.easyBuy.spring.service.EasyBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasyBuyServiceImpl implements EasyBuyService {

    @Autowired
    EasyBuyUserMapper easyBuyUserMapper;

    @Override
    public void save() {
        easyBuyUserMapper.save();
    }


    @Override
    public void findAll() {
        easyBuyUserMapper.findAll();
    }
}
