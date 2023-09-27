package com.easyBuy.mybatisWithSpring.service.impl;

import com.easyBuy.mybatis.pojo.EasyBuyUser;
import com.easyBuy.mybatisWithSpring.mapper.EasyBuyUserMapper;
import com.easyBuy.mybatisWithSpring.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasyBuyUserServiceImpl implements EasyBuyUserService {

    @Autowired
    EasyBuyUserMapper easyBuyUserMapper;

    @Override
    public int count() {
        return easyBuyUserMapper.count();
    }

    @Override
    public List<EasyBuyUser> findAll() throws Exception {
        System.out.println("通过service层了");
        return easyBuyUserMapper.findAll();
    }

    @Override
    public EasyBuyUser findUserById(Integer id) throws Exception {
        return easyBuyUserMapper.findUserById(id);
    }

    @Override
    public void save(EasyBuyUser easyBuyUser) throws Exception {
        easyBuyUserMapper.save(easyBuyUser);
    }

    @Override
    public void modify(EasyBuyUser easyBuyUser) throws Exception {
        easyBuyUserMapper.modify(easyBuyUser);
    }

    @Override
    public void delete(Integer id) throws Exception {
        easyBuyUserMapper.delete(id);

    }

    @Override
    public List<EasyBuyUser> findUserByWhere(EasyBuyUser easyBuyUser) {

        return easyBuyUserMapper.findUserByWhere(easyBuyUser);
    }

    @Override
    public List<EasyBuyUser> findUserByLike(EasyBuyUser easyBuyUser) {

        return easyBuyUserMapper.findUserByLike(easyBuyUser);
    }

    @Override
    public int modifyByTrim(EasyBuyUser easyBuyUser) {
        return easyBuyUserMapper.modifyByTrim(easyBuyUser);
    }

    @Override
    public List<EasyBuyUser> findUserByLimit(int start, int end) {

        return easyBuyUserMapper.findUserByLimit((start-1)*end,end);
    }
}
