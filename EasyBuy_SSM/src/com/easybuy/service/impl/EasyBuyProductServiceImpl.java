package com.easybuy.service.impl;

import com.easybuy.mapper.EasyBuyProductMapper;
import com.easybuy.pojo.EasyBuyProduct;
import com.easybuy.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasyBuyProductServiceImpl implements EasyBuyProductService {

    @Autowired
    EasyBuyProductMapper easyBuyProductMapper;

    @Override
    public List<EasyBuyProduct> findProductByPage(int page, int size) {
        return easyBuyProductMapper.findProductByPage((page-1)*size,size);
    }

    @Override
    public EasyBuyProduct findById(int id) {
        return easyBuyProductMapper.findById(id);
    }

    @Override
    public List<EasyBuyProduct> findProductByCid(int cid, int page, int size) {
        return easyBuyProductMapper.findProductByCid(cid ,(page-1)*size ,size);
    }

    @Override
    public int countProductByCid(int cid) {
        return easyBuyProductMapper.countProductByCid(cid);
    }
}
