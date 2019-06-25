package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigNvzhuangMapper extends mapper类顶层注入接口  {

    List<commonVo<SmallNvzhuang>> selectCascadeByExample(BigNvzhuangExample example);

    long countByExample(BigNvzhuangExample example);

    int deleteByExample(BigNvzhuangExample example);

    int insert(BigNvzhuang record);

    int insertSelective(BigNvzhuang record);

    List<BigNvzhuang> selectByExample(BigNvzhuangExample example);

    int updateByExampleSelective(@Param("record") BigNvzhuang record, @Param("example") BigNvzhuangExample example);

    int updateByExample(@Param("record") BigNvzhuang record, @Param("example") BigNvzhuangExample example);
}