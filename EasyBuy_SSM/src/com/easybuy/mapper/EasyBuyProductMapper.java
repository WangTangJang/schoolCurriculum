package com.easybuy.mapper;

import com.easybuy.pojo.EasyBuyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductMapper {

    public List findProductByPage(@Param("start") int start, @Param("end") int end);


    public EasyBuyProduct findProductById(int id);

    /**
     * 根据商品分类ID，查询商品信息
     * @param cid
     * @param start
     * @param end
     * @return
     */
    public List<EasyBuyProduct> findProductBycid(@Param("cid") int cid,@Param("start") int start,@Param("end") int end);

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
