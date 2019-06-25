package com.jd.mapper;

import com.jd.pojo.Productthree;
import com.jd.pojo.ProductthreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductthreeMapper {
    long countByExample(ProductthreeExample example);

    int deleteByExample(ProductthreeExample example);

    int deleteByPrimaryKey(Integer productthreeid);

    int insert(Productthree record);

    int insertSelective(Productthree record);

    List<Productthree> selectByExample(ProductthreeExample example);

    Productthree selectByPrimaryKey(Integer productthreeid);

    int updateByExampleSelective(@Param("record") Productthree record, @Param("example") ProductthreeExample example);

    int updateByExample(@Param("record") Productthree record, @Param("example") ProductthreeExample example);

    int updateByPrimaryKeySelective(Productthree record);

    int updateByPrimaryKey(Productthree record);
}