package com.easybuy.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductMapper {

    public List findProductByPage(@Param("start") int start, @Param("end") int end);



}
