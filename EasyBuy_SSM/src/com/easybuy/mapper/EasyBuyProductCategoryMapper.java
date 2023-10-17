package com.easybuy.mapper;

import com.easybuy.pojo.EasyBuyProductCategory;

import java.util.List;

public interface EasyBuyProductCategoryMapper {

    public List<EasyBuyProductCategory> getProductCategoryByParentId(int parentId);

}
