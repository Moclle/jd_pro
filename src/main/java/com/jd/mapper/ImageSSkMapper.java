package com.jd.mapper;

import com.jd.pojo.ImageSSk;
import com.jd.pojo.ImageSSkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageSSkMapper {
    long countByExample(ImageSSkExample example);

    int deleteByExample(ImageSSkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageSSk record);

    int insertSelective(ImageSSk record);

    List<ImageSSk> selectByExample(ImageSSkExample example);

    ImageSSk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageSSk record, @Param("example") ImageSSkExample example);

    int updateByExample(@Param("record") ImageSSk record, @Param("example") ImageSSkExample example);

    int updateByPrimaryKeySelective(ImageSSk record);

    int updateByPrimaryKey(ImageSSk record);
}