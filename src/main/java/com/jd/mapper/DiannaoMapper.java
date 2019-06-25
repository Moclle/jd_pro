package com.jd.mapper;

import com.jd.pojo.Diannao;
import com.jd.pojo.DiannaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiannaoMapper {
    long countByExample(DiannaoExample example);

    int deleteByExample(DiannaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diannao record);

    int insertSelective(Diannao record);

    List<Diannao> selectByExample(DiannaoExample example);

    Diannao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diannao record, @Param("example") DiannaoExample example);

    int updateByExample(@Param("record") Diannao record, @Param("example") DiannaoExample example);

    int updateByPrimaryKeySelective(Diannao record);

    int updateByPrimaryKey(Diannao record);
}