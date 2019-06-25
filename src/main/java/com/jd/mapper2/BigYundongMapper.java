package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigYundong;
import com.jd.pojo2.BigYundongExample;
import com.jd.pojo2.SmallYundong;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigYundongMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallYundong>> selectCascadeByExample(BigYundongExample example);


    long countByExample(BigYundongExample example);

    int deleteByExample(BigYundongExample example);

    int insert(BigYundong record);

    int insertSelective(BigYundong record);

    List<BigYundong> selectByExample(BigYundongExample example);

    int updateByExampleSelective(@Param("record") BigYundong record, @Param("example") BigYundongExample example);

    int updateByExample(@Param("record") BigYundong record, @Param("example") BigYundongExample example);
}