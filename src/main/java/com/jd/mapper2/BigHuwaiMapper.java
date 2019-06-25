package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigHuwai;
import com.jd.pojo2.BigHuwaiExample;
import com.jd.pojo2.SmallHuwai;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigHuwaiMapper extends mapper类顶层注入接口 {


    List<commonVo<SmallHuwai>> selectCascadeByExample(BigHuwaiExample example);


    long countByExample(BigHuwaiExample example);

    int deleteByExample(BigHuwaiExample example);

    int insert(BigHuwai record);

    int insertSelective(BigHuwai record);

    List<BigHuwai> selectByExample(BigHuwaiExample example);

    int updateByExampleSelective(@Param("record") BigHuwai record, @Param("example") BigHuwaiExample example);

    int updateByExample(@Param("record") BigHuwai record, @Param("example") BigHuwaiExample example);
}