package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigGehu;
import com.jd.pojo2.BigGehuExample;
import com.jd.pojo2.SmallGehu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigGehuMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallGehu>> selectCascadeByExample(BigGehuExample example);

    long countByExample(BigGehuExample example);

    int deleteByExample(BigGehuExample example);

    int insert(BigGehu record);

    int insertSelective(BigGehu record);

    List<BigGehu> selectByExample(BigGehuExample example);

    int updateByExampleSelective(@Param("record") BigGehu record, @Param("example") BigGehuExample example);

    int updateByExample(@Param("record") BigGehu record, @Param("example") BigGehuExample example);
}