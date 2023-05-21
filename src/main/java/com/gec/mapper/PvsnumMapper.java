package com.gec.mapper;

import com.gec.pojo.Pvsnum;
import com.gec.pojo.PvsnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PvsnumMapper {
    long countByExample(PvsnumExample example);

    int deleteByExample(PvsnumExample example);

    int insert(Pvsnum record);

    int insertSelective(Pvsnum record);

    List<Pvsnum> selectByExample(PvsnumExample example);

    int updateByExampleSelective(@Param("record") Pvsnum record, @Param("example") PvsnumExample example);

    int updateByExample(@Param("record") Pvsnum record, @Param("example") PvsnumExample example);
}