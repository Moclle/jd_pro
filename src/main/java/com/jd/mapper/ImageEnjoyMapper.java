package com.jd.mapper;

import com.jd.pojo.ImageEnjoy;
import com.jd.pojo.ImageEnjoyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageEnjoyMapper {
    long countByExample(ImageEnjoyExample example);

    int deleteByExample(ImageEnjoyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageEnjoy record);

    int insertSelective(ImageEnjoy record);

    List<ImageEnjoy> selectByExample(ImageEnjoyExample example);

    ImageEnjoy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageEnjoy record, @Param("example") ImageEnjoyExample example);

    int updateByExample(@Param("record") ImageEnjoy record, @Param("example") ImageEnjoyExample example);

    int updateByPrimaryKeySelective(ImageEnjoy record);

    int updateByPrimaryKey(ImageEnjoy record);
}