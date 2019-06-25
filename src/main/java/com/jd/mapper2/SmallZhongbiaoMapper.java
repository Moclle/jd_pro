package com.jd.mapper2;

import com.jd.pojo2.SmallZhongbiao;
import com.jd.pojo2.SmallZhongbiaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallZhongbiaoMapper {
    long countByExample(SmallZhongbiaoExample example);

    int deleteByExample(SmallZhongbiaoExample example);

    int insert(SmallZhongbiao record);

    int insertSelective(SmallZhongbiao record);

    List<SmallZhongbiao> selectByExample(SmallZhongbiaoExample example);

    int updateByExampleSelective(@Param("record") SmallZhongbiao record,
                                 @Param("example") SmallZhongbiaoExample example);

    int updateByExample(@Param("record") SmallZhongbiao record, @Param("example") SmallZhongbiaoExample example);
}