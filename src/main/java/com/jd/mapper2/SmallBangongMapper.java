package com.jd.mapper2;

import com.jd.pojo2.SmallBangong;
import com.jd.pojo2.SmallBangongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallBangongMapper {
    long countByExample(SmallBangongExample example);

    int deleteByExample(SmallBangongExample example);

    int insert(SmallBangong record);

    int insertSelective(SmallBangong record);

    List<SmallBangong> selectByExample(SmallBangongExample example);

    int updateByExampleSelective(@Param("record") SmallBangong record, @Param("example") SmallBangongExample example);

    int updateByExample(@Param("record") SmallBangong record, @Param("example") SmallBangongExample example);
}