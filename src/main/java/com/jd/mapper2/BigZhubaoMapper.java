package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigZhubao;
import com.jd.pojo2.BigZhubaoExample;
import com.jd.pojo2.SmallZhubao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigZhubaoMapper extends mapper类顶层注入接口 {


    List<commonVo<SmallZhubao>> selectCascadeByExample(BigZhubaoExample example);


    long countByExample(BigZhubaoExample example);

    int deleteByExample(BigZhubaoExample example);

    int insert(BigZhubao record);

    int insertSelective(BigZhubao record);

    List<BigZhubao> selectByExample(BigZhubaoExample example);

    int updateByExampleSelective(@Param("record") BigZhubao record, @Param("example") BigZhubaoExample example);

    int updateByExample(@Param("record") BigZhubao record, @Param("example") BigZhubaoExample example);
}