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
    public List findProductByPage(int page, int size) {
        return easyBuyProductMapper.findProductByPage((page-1)*size,size);
    }

    @Override
    public EasyBuyProduct findProductById(int id) {
        return easyBuyProductMapper.findProductById(id);
    }
    /**
     * 根据商品分类ID，查询商品信息
     */
    @Override
    public List<EasyBuyProduct> findProductBycid(int cid, int page, int size) {
        return easyBuyProductMapper.findProductBycid(cid,(page-1)*size,size);
    }

    @Override
    public int countProductByCid(int cid) {
        return easyBuyProductMapper.countProductByCid(cid);
    }

    @Override
    public int save(EasyBuyProduct easyBuyProduct) {
        return easyBuyProductMapper.save(easyBuyProduct);
    }

    @Override
    public int modify(EasyBuyProduct easyBuyProduct) {
        return easyBuyProductMapper.modify(easyBuyProduct);
    }

    @Override
    public int delete(int id) {
        return easyBuyProductMapper.delete(id);
    }

}
