package com.jd.mapper2;

import com.jd.pojo2.SmallChuju;
import com.jd.pojo2.SmallChujuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallChujuMapper {
    long countByExample(SmallChujuExample example);

    int deleteByExample(SmallChujuExample example);

    int insert(SmallChuju record);

    int insertSelective(SmallChuju record);

    List<SmallChuju> selectByExample(SmallChujuExample example);

    int updateByExampleSelective(@Param("record") SmallChuju record, @Param("example") SmallChujuExample example);

    int updateByExample(@Param("record") SmallChuju record, @Param("example") SmallChujuExample example);
}