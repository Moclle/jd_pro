package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigTongzhuangMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallTongzhuang>> selectCascadeByExample(BigTongzhuangExample example);

    long countByExample(BigTongzhuangExample example);

    int deleteByExample(BigTongzhuangExample example);

    int insert(BigTongzhuang record);

    int insertSelective(BigTongzhuang record);

    List<BigTongzhuang> selectByExample(BigTongzhuangExample example);

    int updateByExampleSelective(@Param("record") BigTongzhuang record, @Param("example") BigTongzhuangExample example);

    int updateByExample(@Param("record") BigTongzhuang record, @Param("example") BigTongzhuangExample example);
}