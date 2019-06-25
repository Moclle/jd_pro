package com.jd.mapper;

import com.jd.VO.PhoneVo.PhoneBigAndSmallVO;
import com.jd.pojo.BigPhone;
import com.jd.pojo.BigPhoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigPhoneMapper {

    List<PhoneBigAndSmallVO> selectCascadeByExample(BigPhoneExample example);

    long countByExample(BigPhoneExample example);

    int deleteByExample(BigPhoneExample example);

    int insert(BigPhone record);

    int insertSelective(BigPhone record);

    List<BigPhone> selectByExample(BigPhoneExample example);

    int updateByExampleSelective(@Param("record") BigPhone record, @Param("example") BigPhoneExample example);

    int updateByExample(@Param("record") BigPhone record, @Param("example") BigPhoneExample example);
}