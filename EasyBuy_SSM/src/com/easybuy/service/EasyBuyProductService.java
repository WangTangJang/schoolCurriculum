package com.easybuy.service;

import com.easybuy.pojo.EasyBuyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductService {

    public List<EasyBuyProduct> findProductByPage(int page, int size);

}
