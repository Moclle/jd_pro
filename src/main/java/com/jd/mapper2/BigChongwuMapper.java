package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigChongwuMapper extends mapper类顶层注入接口 {


    List<commonVo<SmallChongwu>> selectCascadeByExample(BigChongwuExample example);

    long countByExample(BigChongwuExample example);

    int deleteByExample(BigChongwuExample example);

    int insert(BigChongwu record);

    int insertSelective(BigChongwu record);

    List<BigChongwu> selectByExample(BigChongwuExample example);

    int updateByExampleSelective(@Param("record") BigChongwu record, @Param("example") BigChongwuExample example);

    int updateByExample(@Param("record") BigChongwu record, @Param("example") BigChongwuExample example);
}