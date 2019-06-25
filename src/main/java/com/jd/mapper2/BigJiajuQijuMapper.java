package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigJiajuQijuMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallJiajuQiju>> selectCascadeByExample(BigJiajuQijuExample example);

    long countByExample(BigJiajuQijuExample example);

    int deleteByExample(BigJiajuQijuExample example);

    int insert(BigJiajuQiju record);

    int insertSelective(BigJiajuQiju record);

    List<BigJiajuQiju> selectByExample(BigJiajuQijuExample example);

    int updateByExampleSelective(@Param("record") BigJiajuQiju record, @Param("example") BigJiajuQijuExample example);

    int updateByExample(@Param("record") BigJiajuQiju record, @Param("example") BigJiajuQijuExample example);
}