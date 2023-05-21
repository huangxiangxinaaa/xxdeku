package com.gec.service;

import com.gec.pojo.PvsNumVo;
import com.gec.pojo.ResultVo;
import com.gec.pojo.AvgPvsVo;
import com.gec.pojo.VNumVo;

public interface FlowService {
    /**
     * 获取pvs
     * @param startDate 查询条件的开始时间
     * @param endDate 查询条件的结束时间
     * @return ResultVo
     */
    ResultVo getPvs(String startDate,String endDate);

    AvgPvsVo getAvgPvs(String s, String s1);

    VNumVo getVNum(String s2, String s3);

    PvsNumVo getPvsnum(String s4, String s5);
}
