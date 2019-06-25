package com.jd.mapper;

import com.jd.pojo.Zhinengshebei;
import com.jd.pojo.ZhinengshebeiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhinengshebeiMapper {
    long countByExample(ZhinengshebeiExample example);

    int deleteByExample(ZhinengshebeiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zhinengshebei record);

    int insertSelective(Zhinengshebei record);

    List<Zhinengshebei> selectByExample(ZhinengshebeiExample example);

    Zhinengshebei selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zhinengshebei record, @Param("example") ZhinengshebeiExample example);

    int updateByExample(@Param("record") Zhinengshebei record, @Param("example") ZhinengshebeiExample example);

    int updateByPrimaryKeySelective(Zhinengshebei record);

    int updateByPrimaryKey(Zhinengshebei record);
}