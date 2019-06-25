package com.jd.mapper2;

import com.jd.pojo2.SmallJiazhuang;
import com.jd.pojo2.SmallJiazhuangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallJiazhuangMapper {
    long countByExample(SmallJiazhuangExample example);

    int deleteByExample(SmallJiazhuangExample example);

    int insert(SmallJiazhuang record);

    int insertSelective(SmallJiazhuang record);

    List<SmallJiazhuang> selectByExample(SmallJiazhuangExample example);

    int updateByExampleSelective(@Param("record") SmallJiazhuang record,
                                 @Param("example") SmallJiazhuangExample example);

    int updateByExample(@Param("record") SmallJiazhuang record, @Param("example") SmallJiazhuangExample example);
}