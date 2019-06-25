package com.jd.mapper2;

import com.jd.pojo2.SmallNvzhuang;
import com.jd.pojo2.SmallNvzhuangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallNvzhuangMapper {
    long countByExample(SmallNvzhuangExample example);

    int deleteByExample(SmallNvzhuangExample example);

    int insert(SmallNvzhuang record);

    int insertSelective(SmallNvzhuang record);

    List<SmallNvzhuang> selectByExample(SmallNvzhuangExample example);

    int updateByExampleSelective(@Param("record") SmallNvzhuang record, @Param("example") SmallNvzhuangExample example);

    int updateByExample(@Param("record") SmallNvzhuang record, @Param("example") SmallNvzhuangExample example);
}