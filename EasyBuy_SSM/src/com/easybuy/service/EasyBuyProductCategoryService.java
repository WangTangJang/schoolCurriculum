package com.easybuy.service;

import com.easybuy.pojo.EasyBuyProductCategory;

import java.util.List;
import java.util.Map;

public interface EasyBuyProductCategoryService {
    public Map<String , List<EasyBuyProductCategory>> getProductCategoryByParentId(int parentId);
}
