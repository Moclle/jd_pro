package com.jd.mapper2;

import com.jd.pojo2.SmallTongzhuang;
import com.jd.pojo2.SmallTongzhuangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallTongzhuangMapper {
    long countByExample(SmallTongzhuangExample example);

    int deleteByExample(SmallTongzhuangExample example);

    int insert(SmallTongzhuang record);

    int insertSelective(SmallTongzhuang record);

    List<SmallTongzhuang> selectByExample(SmallTongzhuangExample example);

    int updateByExampleSelective(@Param("record") SmallTongzhuang record,
                                 @Param("example") SmallTongzhuangExample example);

    int updateByExample(@Param("record") SmallTongzhuang record, @Param("example") SmallTongzhuangExample example);
}