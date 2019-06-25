package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigShumaMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallShuma>> selectCascadeByExample(BigShumaExample example);

    long countByExample(BigShumaExample example);

    int deleteByExample(BigShumaExample example);

    int insert(BigShuma record);

    int insertSelective(BigShuma record);

    List<BigShuma> selectByExample(BigShumaExample example);

    int updateByExampleSelective(@Param("record") BigShuma record, @Param("example") BigShumaExample example);

    int updateByExample(@Param("record") BigShuma record, @Param("example") BigShumaExample example);
}