package com.easyBuy.ssm.service;

import com.easyBuy.ssm.pojo.EasyBuyNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyNewsService {

    public List<EasyBuyNews> findNewsByPage(int page,int size);



}
