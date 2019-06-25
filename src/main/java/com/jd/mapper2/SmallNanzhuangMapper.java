package com.jd.mapper2;

import com.jd.pojo2.SmallNanzhuang;
import com.jd.pojo2.SmallNanzhuangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallNanzhuangMapper {
    long countByExample(SmallNanzhuangExample example);

    int deleteByExample(SmallNanzhuangExample example);

    int insert(SmallNanzhuang record);

    int insertSelective(SmallNanzhuang record);

    List<SmallNanzhuang> selectByExample(SmallNanzhuangExample example);

    int updateByExampleSelective(@Param("record") SmallNanzhuang record,
                                 @Param("example") SmallNanzhuangExample example);

    int updateByExample(@Param("record") SmallNanzhuang record, @Param("example") SmallNanzhuangExample example);
}