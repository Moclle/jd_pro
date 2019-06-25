package com.jd.mapper;

import com.jd.pojo.SmallPhone;
import com.jd.pojo.SmallPhoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallPhoneMapper {
    long countByExample(SmallPhoneExample example);

    int deleteByExample(SmallPhoneExample example);

    int insert(SmallPhone record);

    int insertSelective(SmallPhone record);

    List<SmallPhone> selectByExample(SmallPhoneExample example);

    int updateByExampleSelective(@Param("record") SmallPhone record, @Param("example") SmallPhoneExample example);

    int updateByExample(@Param("record") SmallPhone record, @Param("example") SmallPhoneExample example);
}