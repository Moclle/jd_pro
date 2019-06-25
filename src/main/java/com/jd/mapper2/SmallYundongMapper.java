package com.jd.mapper2;

import com.jd.pojo2.SmallYundong;
import com.jd.pojo2.SmallYundongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallYundongMapper {
    long countByExample(SmallYundongExample example);

    int deleteByExample(SmallYundongExample example);

    int insert(SmallYundong record);

    int insertSelective(SmallYundong record);

    List<SmallYundong> selectByExample(SmallYundongExample example);

    int updateByExampleSelective(@Param("record") SmallYundong record, @Param("example") SmallYundongExample example);

    int updateByExample(@Param("record") SmallYundong record, @Param("example") SmallYundongExample example);
}