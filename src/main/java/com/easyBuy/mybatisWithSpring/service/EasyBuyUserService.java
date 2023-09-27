package com.easyBuy.mybatisWithSpring.service;

import com.easyBuy.mybatis.pojo.EasyBuyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户数据访问层接口
 */
public interface EasyBuyUserService {

    /**
     * 统计用户数量
     * @return 用户数
     */
    public int count();


    /**
     * 返回所有的用户信息
     * @return 查询的用户信息
     * @throws Exception 异常
     */
    public List<EasyBuyUser> findAll()throws  Exception;

    /**
     * 根据ID查询用户信息
     */
    public EasyBuyUser findUserById(Integer id)throws Exception;

    /**
     * 保存
     * @param easyBuyUser 一个实体类
     * @throws Exception 异常
     */
    public void save(EasyBuyUser easyBuyUser)throws Exception;

    /**
     * 修改
     */
    public void modify(EasyBuyUser easyBuyUser)throws Exception;

    /**
     * 删除
     */
    public void delete(Integer id)throws Exception;

    /**
     * 根据用户条件查询用户信息
     */
    public List<EasyBuyUser> findUserByWhere(EasyBuyUser easyBuyUser);

    /**
     * 模糊查询
     */
    public List<EasyBuyUser> findUserByLike(EasyBuyUser easyBuyUser);

    /**
     * 通过trim修改
     */
    public int modifyByTrim(EasyBuyUser easyBuyUser);

    /**
     * 分页查找
     */
    public List<EasyBuyUser> findUserByLimit(
            @Param("start") int start,
            @Param("end") int end
    );
}

