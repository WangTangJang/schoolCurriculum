package com.easyBuy.ssm.mapper;

import com.easyBuy.ssm.pojo.EasyBuyNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyNewsMapper {
	public List<EasyBuyNews> findNewsByPage(@Param("start")int start, @Param("end") int end);
}
