package com.jd.mapper;

import com.jd.pojo.ImageBig;
import com.jd.pojo.ImageBigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageBigMapper {
    long countByExample(ImageBigExample example);

    int deleteByExample(ImageBigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageBig record);

    int insertSelective(ImageBig record);

    List<ImageBig> selectByExample(ImageBigExample example);

    ImageBig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageBig record, @Param("example") ImageBigExample example);

    int updateByExample(@Param("record") ImageBig record, @Param("example") ImageBigExample example);

    int updateByPrimaryKeySelective(ImageBig record);

    int updateByPrimaryKey(ImageBig record);
}