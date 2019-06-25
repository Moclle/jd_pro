package com.jd.mapper2;

import com.jd.pojo2.SmallNvxie;
import com.jd.pojo2.SmallNvxieExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallNvxieMapper {
    long countByExample(SmallNvxieExample example);

    int deleteByExample(SmallNvxieExample example);

    int insert(SmallNvxie record);

    int insertSelective(SmallNvxie record);

    List<SmallNvxie> selectByExample(SmallNvxieExample example);

    int updateByExampleSelective(@Param("record") SmallNvxie record, @Param("example") SmallNvxieExample example);

    int updateByExample(@Param("record") SmallNvxie record, @Param("example") SmallNvxieExample example);
}