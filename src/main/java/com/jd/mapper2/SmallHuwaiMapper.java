package com.jd.mapper2;

import com.jd.pojo2.SmallHuwai;
import com.jd.pojo2.SmallHuwaiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallHuwaiMapper {
    long countByExample(SmallHuwaiExample example);

    int deleteByExample(SmallHuwaiExample example);

    int insert(SmallHuwai record);

    int insertSelective(SmallHuwai record);

    List<SmallHuwai> selectByExample(SmallHuwaiExample example);

    int updateByExampleSelective(@Param("record") SmallHuwai record, @Param("example") SmallHuwaiExample example);

    int updateByExample(@Param("record") SmallHuwai record, @Param("example") SmallHuwaiExample example);
}