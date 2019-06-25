package com.jd.mapper2;

import com.jd.pojo2.SmallShuma;
import com.jd.pojo2.SmallShumaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallShumaMapper {
    long countByExample(SmallShumaExample example);

    int deleteByExample(SmallShumaExample example);

    int insert(SmallShuma record);

    int insertSelective(SmallShuma record);

    List<SmallShuma> selectByExample(SmallShumaExample example);

    int updateByExampleSelective(@Param("record") SmallShuma record, @Param("example") SmallShumaExample example);

    int updateByExample(@Param("record") SmallShuma record, @Param("example") SmallShumaExample example);
}