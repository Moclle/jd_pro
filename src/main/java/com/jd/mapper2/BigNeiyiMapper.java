package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigNeiyiMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallNeiyi>> selectCascadeByExample(BigNeiyiExample example);

    long countByExample(BigNeiyiExample example);

    int deleteByExample(BigNeiyiExample example);

    int insert(BigNeiyi record);

    int insertSelective(BigNeiyi record);

    List<BigNeiyi> selectByExample(BigNeiyiExample example);

    int updateByExampleSelective(@Param("record") BigNeiyi record, @Param("example") BigNeiyiExample example);

    int updateByExample(@Param("record") BigNeiyi record, @Param("example") BigNeiyiExample example);
}