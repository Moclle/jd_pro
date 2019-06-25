package com.jd.mapper2;

import com.jd.pojo2.SmallJiajuZhu;
import com.jd.pojo2.SmallJiajuZhuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallJiajuZhuMapper {
    long countByExample(SmallJiajuZhuExample example);

    int deleteByExample(SmallJiajuZhuExample example);

    int insert(SmallJiajuZhu record);

    int insertSelective(SmallJiajuZhu record);

    List<SmallJiajuZhu> selectByExample(SmallJiajuZhuExample example);

    int updateByExampleSelective(@Param("record") SmallJiajuZhu record, @Param("example") SmallJiajuZhuExample example);

    int updateByExample(@Param("record") SmallJiajuZhu record, @Param("example") SmallJiajuZhuExample example);
}