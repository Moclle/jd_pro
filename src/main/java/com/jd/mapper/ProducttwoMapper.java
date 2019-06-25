package com.jd.mapper;

import com.jd.pojo.Producttwo;
import com.jd.pojo.ProducttwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducttwoMapper {
    long countByExample(ProducttwoExample example);

    int deleteByExample(ProducttwoExample example);

    int deleteByPrimaryKey(Integer producttwoid);

    int insert(Producttwo record);

    int insertSelective(Producttwo record);

    List<Producttwo> selectByExample(ProducttwoExample example);

    Producttwo selectByPrimaryKey(Integer producttwoid);

    int updateByExampleSelective(@Param("record") Producttwo record, @Param("example") ProducttwoExample example);

    int updateByExample(@Param("record") Producttwo record, @Param("example") ProducttwoExample example);

    int updateByPrimaryKeySelective(Producttwo record);

    int updateByPrimaryKey(Producttwo record);
}