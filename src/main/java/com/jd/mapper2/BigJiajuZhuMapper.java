package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigJiajuZhu;
import com.jd.pojo2.BigJiajuZhuExample;
import com.jd.pojo2.SmallJiajuZhu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigJiajuZhuMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallJiajuZhu>> selectCascadeByExample(BigJiajuZhuExample example);

    long countByExample(BigJiajuZhuExample example);

    int deleteByExample(BigJiajuZhuExample example);

    int insert(BigJiajuZhu record);

    int insertSelective(BigJiajuZhu record);

    List<BigJiajuZhu> selectByExample(BigJiajuZhuExample example);

    int updateByExampleSelective(@Param("record") BigJiajuZhu record, @Param("example") BigJiajuZhuExample example);

    int updateByExample(@Param("record") BigJiajuZhu record, @Param("example") BigJiajuZhuExample example);
}