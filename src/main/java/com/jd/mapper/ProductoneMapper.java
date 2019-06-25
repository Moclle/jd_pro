package com.jd.mapper;

import com.jd.VO.ProductOne2ThreeAndFourVO;
import com.jd.VO.ProductOne2TwoVO;
import com.jd.pojo.Productone;
import com.jd.pojo.ProductoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductoneMapper {

    /**
     * 手写sql语句
     */

    List<ProductOne2TwoVO> myGetOne2TwoList();
    List<ProductOne2ThreeAndFourVO> myGetOne2ThreeAndFourList();

    /**
     * 手写sql结束
     */



    long countByExample(ProductoneExample example);

    int deleteByExample(ProductoneExample example);

    int deleteByPrimaryKey(Integer productoneid);

    int insert(Productone record);

    int insertSelective(Productone record);

    List<Productone> selectByExample(ProductoneExample example);

    Productone selectByPrimaryKey(Integer productoneid);

    int updateByExampleSelective(@Param("record") Productone record, @Param("example") ProductoneExample example);

    int updateByExample(@Param("record") Productone record, @Param("example") ProductoneExample example);

    int updateByPrimaryKeySelective(Productone record);

    int updateByPrimaryKey(Productone record);
}