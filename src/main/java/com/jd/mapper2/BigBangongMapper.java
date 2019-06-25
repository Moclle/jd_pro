package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigBangong;
import com.jd.pojo2.BigBangongExample;
import com.jd.pojo2.SmallBangong;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigBangongMapper extends mapper类顶层注入接口 {

//    List<PhoneBigAndSmallVO> selectCascadeByExample(BigPhoneExample example);

    List<commonVo<SmallBangong>> selectCascadeByExample(BigBangongExample example);


    long countByExample(BigBangongExample example);

    int deleteByExample(BigBangongExample example);

    int insert(BigBangong record);

    int insertSelective(BigBangong record);

    List<BigBangong> selectByExample(BigBangongExample example);

    int updateByExampleSelective(@Param("record") BigBangong record, @Param("example") BigBangongExample example);

    int updateByExample(@Param("record") BigBangong record, @Param("example") BigBangongExample example);
}