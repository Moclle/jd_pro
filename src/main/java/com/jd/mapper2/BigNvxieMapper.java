package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigNvxie;
import com.jd.pojo2.BigNvxieExample;
import com.jd.pojo2.SmallNvxie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigNvxieMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallNvxie>> selectCascadeByExample(BigNvxieExample example);

    long countByExample(BigNvxieExample example);

    int deleteByExample(BigNvxieExample example);

    int insert(BigNvxie record);

    int insertSelective(BigNvxie record);

    List<BigNvxie> selectByExample(BigNvxieExample example);

    int updateByExampleSelective(@Param("record") BigNvxie record, @Param("example") BigNvxieExample example);

    int updateByExample(@Param("record") BigNvxie record, @Param("example") BigNvxieExample example);
}