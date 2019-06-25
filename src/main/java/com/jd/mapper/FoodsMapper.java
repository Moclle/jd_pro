package com.jd.mapper;

import com.jd.pojo.Foods;
import com.jd.pojo.FoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodsMapper {
    long countByExample(FoodsExample example);

    int deleteByExample(FoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    List<Foods> selectByExample(FoodsExample example);

    Foods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Foods record, @Param("example") FoodsExample example);

    int updateByExample(@Param("record") Foods record, @Param("example") FoodsExample example);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}