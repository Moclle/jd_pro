package com.jd.mapper2;

import com.jd.VO.commonVO.commonVo;
import com.jd.pojo2.BigXiangbao;
import com.jd.pojo2.BigXiangbaoExample;
import com.jd.pojo2.SmallXiangbao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigXiangbaoMapper extends mapper类顶层注入接口  {


    List<commonVo<SmallXiangbao>> selectCascadeByExample(BigXiangbaoExample example);


    long countByExample(BigXiangbaoExample example);

    int deleteByExample(BigXiangbaoExample example);

    int insert(BigXiangbao record);

    int insertSelective(BigXiangbao record);

    List<BigXiangbao> selectByExample(BigXiangbaoExample example);

    int updateByExampleSelective(@Param("record") BigXiangbao record, @Param("example") BigXiangbaoExample example);

    int updateByExample(@Param("record") BigXiangbao record, @Param("example") BigXiangbaoExample example);
}