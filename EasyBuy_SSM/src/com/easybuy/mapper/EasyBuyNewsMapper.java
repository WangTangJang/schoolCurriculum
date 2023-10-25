package com.easybuy.mapper;

import com.easybuy.pojo.EasyBuyNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyNewsMapper {

    public List<EasyBuyNews> findNewsByPage(@Param("start") int start, @Param("end")  int end);

    public EasyBuyNews getEasyBuyNewsById(int id);

    public int count();


}
