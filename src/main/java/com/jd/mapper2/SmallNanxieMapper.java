package com.jd.mapper2;

import com.jd.pojo2.SmallNanxie;
import com.jd.pojo2.SmallNanxieExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmallNanxieMapper {
    long countByExample(SmallNanxieExample example);

    int deleteByExample(SmallNanxieExample example);

    int insert(SmallNanxie record);

    int insertSelective(SmallNanxie record);

    List<SmallNanxie> selectByExample(SmallNanxieExample example);

    int updateByExampleSelective(@Param("record") SmallNanxie record, @Param("example") SmallNanxieExample example);

    int updateByExample(@Param("record") SmallNanxie record, @Param("example") SmallNanxieExample example);
}