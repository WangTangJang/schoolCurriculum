package com.easyBuy.springMVC.mapper;

import com.easyBuy.springMVC.pojo.EasyBuyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户数据访问层接口
 */
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



    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    public EasyBuyUser findUserById(Integer id)throws Exception;

    /**
     * 添加用户
     * @param easyBuyUser
     * @throws Exception
     */
    public void save(EasyBuyUser easyBuyUser)throws Exception;

    /**
     * 修改用户
     * @param easyBuyUser
     * @throws Exception
     */
    public void modify(EasyBuyUser easyBuyUser)throws Exception;

    /**
     * 删除用户
     * @param id
     * @throws Exception
     */
    public void delete(Integer id)throws Exception;

    /**
     * 根据条件查询用户信息
     * @return
     * @throws Exception
     */
    public List<EasyBuyUser> findByWhere(EasyBuyUser easyBuyUser) throws Exception;

    /**
     * 根据条件查询用户信息
     * @return
     * @throws Exception
     */
    public List<EasyBuyUser> findByWhere2(EasyBuyUser easyBuyUser) throws Exception;

    public void modify2(EasyBuyUser easyBuyUser)throws Exception;

    public void modify3(EasyBuyUser easyBuyUser)throws Exception;

    public List<EasyBuyUser> findByWhere3(EasyBuyUser easyBuyUser) throws Exception;


    public List<EasyBuyUser> findByWhere4(@Param("start") int start, @Param("rows") int rows) throws Exception;

}

