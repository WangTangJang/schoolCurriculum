package com.easybuy.mapper;

import com.easybuy.pojo.EasyBuyProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasyBuyProductMapper {

    public List findProductByPage(@Param("start") int start, @Param("end") int end);

    public EasyBuyProduct findById(int id);

    public List<EasyBuyProduct> findProductByCid(@Param("cid") int cid,@Param("start") int start,@Param("end") int end);
}
