package com.easybuy.mapper;

import org.apache.ibatis.annotations.Param;

public interface EasyBuyProductMapper {

    public String findProductByPage(@Param("start") int start,@Param("end") int end);



}
