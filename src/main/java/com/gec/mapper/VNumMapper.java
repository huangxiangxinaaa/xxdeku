package com.gec.mapper;

import com.gec.pojo.VNum;
import com.gec.pojo.VNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VNumMapper {
    long countByExample(VNumExample example);

    int deleteByExample(VNumExample example);

    int insert(VNum record);

    int insertSelective(VNum record);

    List<VNum> selectByExample(VNumExample example);

    int updateByExampleSelective(@Param("record") VNum record, @Param("example") VNumExample example);

    int updateByExample(@Param("record") VNum record, @Param("example") VNumExample example);
}