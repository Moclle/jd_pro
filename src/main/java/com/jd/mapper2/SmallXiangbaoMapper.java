package com.jd.mapper2;

import com.jd.pojo2.SmallXiangbao;
import com.jd.pojo2.SmallXiangbaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallXiangbaoMapper {
    long countByExample(SmallXiangbaoExample example);

    int deleteByExample(SmallXiangbaoExample example);

    int insert(SmallXiangbao record);

    int insertSelective(SmallXiangbao record);

    List<SmallXiangbao> selectByExample(SmallXiangbaoExample example);

    int updateByExampleSelective(@Param("record") SmallXiangbao record, @Param("example") SmallXiangbaoExample example);

    int updateByExample(@Param("record") SmallXiangbao record, @Param("example") SmallXiangbaoExample example);
}