package com.jd.mapper;

import com.jd.pojo.ImageSk;
import com.jd.pojo.ImageSkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageSkMapper {
    long countByExample(ImageSkExample example);

    int deleteByExample(ImageSkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageSk record);

    int insertSelective(ImageSk record);

    List<ImageSk> selectByExample(ImageSkExample example);

    ImageSk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageSk record, @Param("example") ImageSkExample example);

    int updateByExample(@Param("record") ImageSk record, @Param("example") ImageSkExample example);

    int updateByPrimaryKeySelective(ImageSk record);

    int updateByPrimaryKey(ImageSk record);
}