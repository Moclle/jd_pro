package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigNanzhuangMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallNanzhuang>> selectCascadeByExample(BigNanzhuangExample example);

    long countByExample(BigNanzhuangExample example);

    int deleteByExample(BigNanzhuangExample example);

    int insert(BigNanzhuang record);

    int insertSelective(BigNanzhuang record);

    List<BigNanzhuang> selectByExample(BigNanzhuangExample example);

    int updateByExampleSelective(@Param("record") BigNanzhuang record, @Param("example") BigNanzhuangExample example);

    int updateByExample(@Param("record") BigNanzhuang record, @Param("example") BigNanzhuangExample example);
}