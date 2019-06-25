package com.jd.mapper2;

import com.jd.pojo2.SmallChongwu;
import com.jd.pojo2.SmallChongwuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallChongwuMapper {
    long countByExample(SmallChongwuExample example);

    int deleteByExample(SmallChongwuExample example);

    int insert(SmallChongwu record);

    int insertSelective(SmallChongwu record);

    List<SmallChongwu> selectByExample(SmallChongwuExample example);

    int updateByExampleSelective(@Param("record") SmallChongwu record, @Param("example") SmallChongwuExample example);

    int updateByExample(@Param("record") SmallChongwu record, @Param("example") SmallChongwuExample example);
}