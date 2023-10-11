package com.easybuy.service;

import org.apache.ibatis.annotations.Param;

public interface EasyBuyProductService {

    public String findProductByPage(int page, int size);



}
