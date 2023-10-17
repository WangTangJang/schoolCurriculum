package com.easybuy.service.impl;

import com.easybuy.mapper.EasyBuyProductCategoryMapper;
import com.easybuy.pojo.EasyBuyProductCategory;
import com.easybuy.service.EasyBuyProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EasyBuyProductCategoryServiceImpl implements EasyBuyProductCategoryService {

    @Autowired
    EasyBuyProductCategoryMapper easyBuyProductCategoryMapper;


    @Override
    public Map<String, List<EasyBuyProductCategory>> getProductCategoryByParentId(int parentId) {

        Map<String , List<EasyBuyProductCategory>> map = new HashMap<>();
        List<EasyBuyProductCategory> List1 = easyBuyProductCategoryMapper.getProductCategoryByParentId(0);

        for (EasyBuyProductCategory e:List1){
            List list2 = easyBuyProductCategoryMapper.getProductCategoryByParentId(e.getId());
            map.put(e.getName(),list2);
        }
        return map;
    }
}
