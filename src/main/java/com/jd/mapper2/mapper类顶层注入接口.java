package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigBangong;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface mapper类顶层注入接口<T> {
    List<commonVo<Object>> selectCascadeByExample(Object example);


    long countByExample(Object example);

    int deleteByExample(Object example);

    int insert(Object record);

    int insertSelective(Object record);

    List<BigBangong> selectByExample(Object example);

    int updateByExampleSelective(Object record, Object example);

    int updateByExample(Object record, Object example);
}
