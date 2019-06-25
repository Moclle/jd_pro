package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigNanxie;
import com.jd.pojo2.BigNanxieExample;
import com.jd.pojo2.SmallNanxie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigNanxieMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallNanxie>> selectCascadeByExample(BigNanxieExample example);


    long countByExample(BigNanxieExample example);

    int deleteByExample(BigNanxieExample example);

    int insert(BigNanxie record);

    int insertSelective(BigNanxie record);

    List<BigNanxie> selectByExample(BigNanxieExample example);

    int updateByExampleSelective(@Param("record") BigNanxie record, @Param("example") BigNanxieExample example);

    int updateByExample(@Param("record") BigNanxie record, @Param("example") BigNanxieExample example);
}