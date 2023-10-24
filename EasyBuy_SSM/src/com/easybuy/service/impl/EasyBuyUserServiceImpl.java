package com.easybuy.service.impl;

import com.easybuy.mapper.EasyBuyUserMapper;
import com.easybuy.pojo.EasyBuyUser;
import com.easybuy.service.EasyBuyUserService;
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
    public List<EasyBuyUser> findAll(int page,int size) throws Exception {
        return easyBuyUserMapper.findAll((page-1)*size,size);
    }

    @Override
    public EasyBuyUser login(String loginName, String password) throws Exception {
        return easyBuyUserMapper.login(loginName,password);
    }


    /**
     * 注册用户
     * @param eu
     * @return
     */
    public int save(EasyBuyUser eu){
        return easyBuyUserMapper.save(eu);
    }

    @Override
    public int deleteUser(int id) {
        return easyBuyUserMapper.deleteUser(id);
    }

    @Override
    public int modifyUser(EasyBuyUser eu) {
        return easyBuyUserMapper.modifyUser(eu);
    }

}
