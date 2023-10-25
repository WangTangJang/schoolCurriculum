package com.easybuy.service.impl;

import com.easybuy.mapper.EasyBuyNewsMapper;
import com.easybuy.pojo.EasyBuyNews;
import com.easybuy.service.EasyBuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasyBuyNewsServiceImpl implements EasyBuyNewsService {


    @Autowired
    EasyBuyNewsMapper easyBuyNewsMapper;


    @Override
    public List<EasyBuyNews> findNewsByPage(int page, int size) {
        return easyBuyNewsMapper.findNewsByPage((page-1)*size,size);
    }

    @Override
    public EasyBuyNews getEasyBuyNewsById(int id) {
        return easyBuyNewsMapper.getEasyBuyNewsById(id);
    }

    @Override
    public int count() {
        return easyBuyNewsMapper.count();
    }
}
