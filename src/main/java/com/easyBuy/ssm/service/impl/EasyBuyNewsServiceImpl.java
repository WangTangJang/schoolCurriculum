package com.easyBuy.ssm.service.impl;

import com.easyBuy.ssm.mapper.EasyBuyNewsMapper;
import com.easyBuy.ssm.pojo.EasyBuyNews;
import com.easyBuy.ssm.service.EasyBuyNewsService;
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
}
