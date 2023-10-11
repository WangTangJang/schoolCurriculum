package com.easyBuy.ssm.service.impl;

import com.easyBuy.ssm.mapper.EasyBuyUserMapper;
import com.easyBuy.ssm.pojo.EasyBuyUser;
import com.easyBuy.ssm.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasyBuyUserServiceImpl implements EasyBuyUserService {

    @Autowired
    EasyBuyUserMapper easyBuyUserMapper;


    @Override
    public int count() throws Exception {
        return easyBuyUserMapper.count();
    }

    @Override
    public List<EasyBuyUser> findAll() throws Exception {
        return easyBuyUserMapper.findAll();
    }

    @Override
    public EasyBuyUser login(String loginName, String password) throws Exception {
        return easyBuyUserMapper.login(loginName,password);
    }
}
