package com.jd.mapper;

import com.jd.pojo.Productfour;
import com.jd.pojo.ProductfourExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductfourMapper {
    long countByExample(ProductfourExample example);

    int deleteByExample(ProductfourExample example);

    int deleteByPrimaryKey(Integer productfourid);

    int insert(Productfour record);

    int insertSelective(Productfour record);

    List<Productfour> selectByExample(ProductfourExample example);

    Productfour selectByPrimaryKey(Integer productfourid);

    int updateByExampleSelective(@Param("record") Productfour record, @Param("example") ProductfourExample example);

    int updateByExample(@Param("record") Productfour record, @Param("example") ProductfourExample example);

    int updateByPrimaryKeySelective(Productfour record);

    int updateByPrimaryKey(Productfour record);
}