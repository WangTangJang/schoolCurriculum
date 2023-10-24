package com.easybuy.service;

import com.easybuy.pojo.EasyBuyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyUserService {


    /**
     * 统计用户数量
     * @return
     */
    public int count()throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    public List<EasyBuyUser> findAll(int page,int size)throws Exception;


    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     * @throws Exception
     */
    public EasyBuyUser login(String loginName,String password)throws Exception;


    /**
     * 注册用户
     * @param eu
     * @return
     */
    public int save(EasyBuyUser eu);


}
