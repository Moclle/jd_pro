package com.jd.mapper2;

import com.jd.pojo2.SmallMeizhuang;
import com.jd.pojo2.SmallMeizhuangExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallMeizhuangMapper {
    long countByExample(SmallMeizhuangExample example);

    int deleteByExample(SmallMeizhuangExample example);

    int insert(SmallMeizhuang record);

    int insertSelective(SmallMeizhuang record);

    List<SmallMeizhuang> selectByExample(SmallMeizhuangExample example);

    int updateByExampleSelective(@Param("record") SmallMeizhuang record,
                                 @Param("example") SmallMeizhuangExample example);

    int updateByExample(@Param("record") SmallMeizhuang record, @Param("example") SmallMeizhuangExample example);
}