package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigZhongbiao;
import com.jd.pojo2.BigZhongbiaoExample;
import com.jd.pojo2.SmallZhongbiao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigZhongbiaoMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallZhongbiao>> selectCascadeByExample(BigZhongbiaoExample example);


    long countByExample(BigZhongbiaoExample example);

    int deleteByExample(BigZhongbiaoExample example);

    int insert(BigZhongbiao record);

    int insertSelective(BigZhongbiao record);

    List<BigZhongbiao> selectByExample(BigZhongbiaoExample example);

    int updateByExampleSelective(@Param("record") BigZhongbiao record, @Param("example") BigZhongbiaoExample example);

    int updateByExample(@Param("record") BigZhongbiao record, @Param("example") BigZhongbiaoExample example);
}