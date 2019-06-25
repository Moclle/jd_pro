package com.jd.mapper;

import com.jd.pojo.ErshouShouji;
import com.jd.pojo.ErshouShoujiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErshouShoujiMapper {
    long countByExample(ErshouShoujiExample example);

    int deleteByExample(ErshouShoujiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErshouShouji record);

    int insertSelective(ErshouShouji record);

    List<ErshouShouji> selectByExample(ErshouShoujiExample example);

    ErshouShouji selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ErshouShouji record, @Param("example") ErshouShoujiExample example);

    int updateByExample(@Param("record") ErshouShouji record, @Param("example") ErshouShoujiExample example);

    int updateByPrimaryKeySelective(ErshouShouji record);

    int updateByPrimaryKey(ErshouShouji record);
}