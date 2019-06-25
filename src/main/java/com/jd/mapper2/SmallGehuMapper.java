package com.jd.mapper2;

import com.jd.pojo2.SmallGehu;
import com.jd.pojo2.SmallGehuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallGehuMapper {
    long countByExample(SmallGehuExample example);

    int deleteByExample(SmallGehuExample example);

    int insert(SmallGehu record);

    int insertSelective(SmallGehu record);

    List<SmallGehu> selectByExample(SmallGehuExample example);

    int updateByExampleSelective(@Param("record") SmallGehu record, @Param("example") SmallGehuExample example);

    int updateByExample(@Param("record") SmallGehu record, @Param("example") SmallGehuExample example);
}