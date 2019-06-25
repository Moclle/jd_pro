package com.jd.mapper2;

import com.jd.pojo2.SmallZhubao;
import com.jd.pojo2.SmallZhubaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallZhubaoMapper {
    long countByExample(SmallZhubaoExample example);

    int deleteByExample(SmallZhubaoExample example);

    int insert(SmallZhubao record);

    int insertSelective(SmallZhubao record);

    List<SmallZhubao> selectByExample(SmallZhubaoExample example);

    int updateByExampleSelective(@Param("record") SmallZhubao record, @Param("example") SmallZhubaoExample example);

    int updateByExample(@Param("record") SmallZhubao record, @Param("example") SmallZhubaoExample example);
}