package com.easybuy.service;

import com.easybuy.pojo.EasyBuyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductService {

    public List<EasyBuyProduct> findProductByPage(int page, int size);

    public EasyBuyProduct findById(int id);

    public List<EasyBuyProduct> findProductByCid(int cid ,int page, int size);

    public int countProductByCid(int cid);

}
