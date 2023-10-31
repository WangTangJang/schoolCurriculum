package com.easybuy.service;

import com.easybuy.pojo.EasyBuyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductService {

    public List<EasyBuyProduct> findProductByPage(int page, int size);


    public EasyBuyProduct findProductById(int id);
    /**
     * 根据商品分类ID，查询商品信息
     */
    public List<EasyBuyProduct> findProductBycid(int cid,int page,int size);
    /**
     * 根据商品分类ID，查询分类记录数
     * @param cid
     * @return
     */
    public int countProductByCid(int cid);

    public int save(EasyBuyProduct easyBuyProduct);

    public int modify(EasyBuyProduct easyBuyProduct);

    public int delete(int id);








}
