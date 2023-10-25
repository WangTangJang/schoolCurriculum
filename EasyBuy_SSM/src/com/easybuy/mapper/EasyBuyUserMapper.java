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
    public List<EasyBuyUser> findAll(@Param("start") int start,@Param("end") int end)throws Exception;


    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     * @throws Exception
     */
    public EasyBuyUser login(@Param("loginName") String loginName, @Param("password") String password)throws Exception;

    /**
     * 注册用户
     * @param eu
     * @return
     */
    public int save(EasyBuyUser eu);

    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    public EasyBuyUser getUserById(int id);

    /**
     * 通过id删除用户
     * @param id id值
     * @return 删除结果
     */
    public int deleteUser(int id);

    /**
     * 通过传进来的用户信息进行修改
     * @param eu 用户信息
     * @return 修改结果
     */
    public int modifyUser(EasyBuyUser eu);

}
