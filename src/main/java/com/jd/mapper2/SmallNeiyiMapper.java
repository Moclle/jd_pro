package com.jd.mapper2;

import com.jd.pojo2.SmallNeiyi;
import com.jd.pojo2.SmallNeiyiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallNeiyiMapper {
    long countByExample(SmallNeiyiExample example);

    int deleteByExample(SmallNeiyiExample example);

    int insert(SmallNeiyi record);

    int insertSelective(SmallNeiyi record);

    List<SmallNeiyi> selectByExample(SmallNeiyiExample example);

    int updateByExampleSelective(@Param("record") SmallNeiyi record, @Param("example") SmallNeiyiExample example);

    int updateByExample(@Param("record") SmallNeiyi record, @Param("example") SmallNeiyiExample example);
}