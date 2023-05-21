package com.gec.mapper;

import com.gec.pojo.AvgPvs;
import com.gec.pojo.AvgPvsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AvgPvsMapper {
    long countByExample(AvgPvsExample example);

    int deleteByExample(AvgPvsExample example);

    int insert(AvgPvs record);

    int insertSelective(AvgPvs record);

    List<AvgPvs> selectByExample(AvgPvsExample example);

    int updateByExampleSelective(@Param("record") AvgPvs record, @Param("example") AvgPvsExample example);

    int updateByExample(@Param("record") AvgPvs record, @Param("example") AvgPvsExample example);
}