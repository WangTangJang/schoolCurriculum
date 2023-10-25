package com.easybuy.service;

import com.easybuy.pojo.EasyBuyNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyNewsService {

    public List<EasyBuyNews> findNewsByPage(int page,int size);

    public EasyBuyNews getEasyBuyNewsById(int id);

    public int count();
}
