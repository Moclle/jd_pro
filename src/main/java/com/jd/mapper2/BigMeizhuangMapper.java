package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigMeizhuang;
import com.jd.pojo2.BigMeizhuangExample;
import com.jd.pojo2.SmallMeizhuang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigMeizhuangMapper extends mapper类顶层注入接口 {

    List<commonVo<SmallMeizhuang>> selectCascadeByExample(BigMeizhuangExample example);

    long countByExample(BigMeizhuangExample example);

    int deleteByExample(BigMeizhuangExample example);

    int insert(BigMeizhuang record);

    int insertSelective(BigMeizhuang record);

    List<BigMeizhuang> selectByExample(BigMeizhuangExample example);

    int updateByExampleSelective(@Param("record") BigMeizhuang record, @Param("example") BigMeizhuangExample example);

    int updateByExample(@Param("record") BigMeizhuang record, @Param("example") BigMeizhuangExample example);
}