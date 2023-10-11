package com.easybuy.mapper;

import com.easybuy.pojo.EasyBuyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyUserMapper {

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
    public List<EasyBuyUser> findAll()throws Exception;


    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     * @throws Exception
     */
    public EasyBuyUser login(@Param("loginName") String loginName, @Param("password") String password)throws Exception;


}
