package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigJiazhuangMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallJiazhuang>> selectCascadeByExample(BigJiazhuangExample example);

    long countByExample(BigJiazhuangExample example);

    int deleteByExample(BigJiazhuangExample example);

    int insert(BigJiazhuang record);

    int insertSelective(BigJiazhuang record);

    List<BigJiazhuang> selectByExample(BigJiazhuangExample example);

    int updateByExampleSelective(@Param("record") BigJiazhuang record, @Param("example") BigJiazhuangExample example);

    int updateByExample(@Param("record") BigJiazhuang record, @Param("example") BigJiazhuangExample example);
}