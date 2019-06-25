package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigChuju;
import com.jd.pojo2.BigChujuExample;
import com.jd.pojo2.SmallBangong;
import com.jd.pojo2.SmallChuju;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigChujuMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallChuju>> selectCascadeByExample(BigChujuExample example);

    long countByExample(BigChujuExample example);

    int deleteByExample(BigChujuExample example);

    int insert(BigChuju record);

    int insertSelective(BigChuju record);

    List<BigChuju> selectByExample(BigChujuExample example);

    int updateByExampleSelective(@Param("record") BigChuju record, @Param("example") BigChujuExample example);

    int updateByExample(@Param("record") BigChuju record, @Param("example") BigChujuExample example);
}