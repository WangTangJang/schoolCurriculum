package com.easybuy.service.impl;

import com.easybuy.mapper.EasyBuyProductMapper;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasyBuyProductServiceImpl implements EasyBuyProductService {

    @Autowired
    EasyBuyProductMapper easyBuyProductMapper;

    @Override
    public List findProductByPage(int page, int size) {
        return easyBuyProductMapper.findProductByPage((page-1)*size,size);
    }
}
