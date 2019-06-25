package com.jd.mapper2;

import com.jd.pojo2.SmallJiajuQiju;
import com.jd.pojo2.SmallJiajuQijuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallJiajuQijuMapper {
    long countByExample(SmallJiajuQijuExample example);

    int deleteByExample(SmallJiajuQijuExample example);

    int insert(SmallJiajuQiju record);

    int insertSelective(SmallJiajuQiju record);

    List<SmallJiajuQiju> selectByExample(SmallJiajuQijuExample example);

    int updateByExampleSelective(@Param("record") SmallJiajuQiju record,
                                 @Param("example") SmallJiajuQijuExample example);

    int updateByExample(@Param("record") SmallJiajuQiju record, @Param("example") SmallJiajuQijuExample example);
}