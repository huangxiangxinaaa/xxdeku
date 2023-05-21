package com.gec.service.impl;

import com.gec.mapper.AvgPvsMapper;
import com.gec.mapper.PvsMapper;
import com.gec.mapper.PvsnumMapper;
import com.gec.mapper.VNumMapper;
import com.gec.pojo.*;
import com.gec.service.FlowService;
import com.gec.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service //业务层
public class FlowServiceImpl implements FlowService {

    private String[] province = {
            "河北省", "山西省", "辽宁省", "吉林省", "黑龙江省", "江苏省", "浙江省", "安徽省",
            "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南", "广东", "海南省", "四川省",
            "贵州省", "云南省", "陕西", "甘肃省", "青海省", "台湾省", "内蒙古自治区", "广西壮族自治区",
            "西藏自治区", "宁夏回族自治区", "新疆维吾尔自治区", "北京市", "天津市", "上海", "重庆市", "香港", "澳门"
    };

    //获取mapper层的对象
    @Autowired
    PvsMapper pvsMapper;
    @Autowired
    AvgPvsMapper avgPvsMapper;
    @Autowired
    VNumMapper vNumMapper;
    @Autowired
    PvsnumMapper pvsNumMapper;

    /**
     * 获取pvs
     *
     * @param startDate 查询条件的开始时间
     * @param endDate   查询条件的结束时间
     * @return ResultVo
     */

    @Override
    public ResultVo getPvs(String startDate, String endDate) {
        PvsExample pvsExample = new PvsExample();
        pvsExample.setOrderByClause("daystr Asc");
        PvsExample.Criteria criteria = pvsExample.createCriteria();
        //封装查询条件
        criteria.andDaystrBetween(startDate, endDate);
        //调用mapper方法
        List<Pvs> pvs = pvsMapper.selectByExample(pvsExample);

        //创建数组
        String[] dates = new String[pvs.size()];
        Long[] data = new Long[pvs.size()];

        //遍历集合pvs
/*        for(int i=0;i<pvs.size();i++){
            //将日期和pv分别保存到数组
            dates[i] = pvs.get(i).getDaystr();
            data[i] = pvs.get(i).getPvs();

        }*/
        int i = 0;
        for (Pvs pv : pvs) {
            //将日期和pv分别保存到数组
            dates[i] = pv.getDaystr();
            data[i] = pv.getPvs();
            i++;
        }
        //创建ResultVo对象
        ResultVo resultVo = new ResultVo();
        //将数组封装到resultVo
        resultVo.setDates(dates);
        resultVo.setData(data);

        return resultVo;
    }

    @Override
    public AvgPvsVo getAvgPvs(String s, String s1) {
        AvgPvsExample avgPvsExample = new AvgPvsExample();
        avgPvsExample.setOrderByClause("daystr Asc");
        AvgPvsExample.Criteria criteria = avgPvsExample.createCriteria();
        //封装查询条件  between ... and
        criteria.andDaystrBetween(s, s1);

        //调用mapper的方法    List<AvgPvs> selectByExample(AvgPvsExample example);
        List<AvgPvs> avgPvs = avgPvsMapper.selectByExample(avgPvsExample);
        //创建数组
        String[] dates = new String[avgPvs.size()];
        String[] data = new String[avgPvs.size()];


        int i = 0;
        for (AvgPvs pv : avgPvs) {
            //将日期和pv分别保存到数组
            dates[i] = pv.getDaystr();
            data[i] = pv.getAvgpvs();
            i++;
        }
        //创建avgPvsVo的对象
        AvgPvsVo avgPvsVo = new AvgPvsVo();
        //将数组封装到avgPvsVo
        avgPvsVo.setDates(dates);
        avgPvsVo.setData(data);

        return avgPvsVo;
    }


    @Override
    public VNumVo getVNum(String s2, String s3) {
        VNumExample vnumExample = new VNumExample();
        vnumExample.setOrderByClause("daystr Asc");
        VNumExample.Criteria criteria = vnumExample.createCriteria();
        //封装查询条件
        criteria.andDaystrBetween(s2, s3);
        //调用mapper方法
        List<VNum> pvs = vNumMapper.selectByExample(vnumExample);

        //创建数组
        String[] dates = new String[pvs.size()];
        String[] uvs = new String[pvs.size()];
        Integer[] newuvs = new Integer[pvs.size()];

        //遍历集合pvs
/*        for(int i=0;i<pvs.size();i++){
            //将日期和pv分别保存到数组
            dates[i] = pvs.get(i).getDaystr();
            data[i] = pvs.get(i).getPvs();

        }*/
        int i = 0;
        for (VNum pv : pvs) {
            //将日期和pv分别保存到数组
            dates[i] = pv.getDaystr();
            uvs[i] = pv.getDepUser();
            newuvs[i] = pv.getNewUsersNum();
            i++;
        }
        //创建ResultVo对象
        VNumVo vNumVo = new VNumVo();
        //将数组封装到resultVo
        vNumVo.setDates(dates);
        vNumVo.setUvs(uvs);
        vNumVo.setNewuvs(newuvs);

        return vNumVo;
    }

    @Override
    public PvsNumVo getPvsnum(String s4, String s5) {
        PvsnumExample pvsnumExample = new PvsnumExample();
        PvsnumExample.Criteria criteria = pvsnumExample.createCriteria();

        criteria.andDaystrBetween(s4, s5);
        //获取到所有IP
        List<Pvsnum> visits = pvsNumMapper.selectByExample(pvsnumExample);
        List<Map<String, Object>> data = new ArrayList<>();
        Object count = 0;
        Map<String, Object> map = null;
        String region = null;

        for (Pvsnum visit : visits) {
            region = IpUtil.getRegion(visit.getIp());
            //过滤国外地址 和 null
            if (Arrays.asList(province).contains(region)) {
                map = new HashMap<>();
                map.put("name", region);
                map.put("value", 1);
                System.out.println(map.toString());
                for (int i = 0; i < data.size(); i++) {
                    Map<String, Object> m = data.get(i);
                    String name = m.get("name").toString();
                    if (region.equals(name)) {
                        //如果map已存在，将该map的value加1
                        count = m.get("value");//获取value
                        map.replace("value", Integer.parseInt(count.toString()) + 1);
                        data.remove(i);
                        break;
                    }
                }
                data.add(map);
            }

        }

        for (Map<String, Object> m : data) {
            String name = m.get("name").toString();
            m.replace("name", name.substring(0, 2));
        }
        System.out.println("数据为：" + data.toString());
        //创建ResultVo
        PvsNumVo pvsnumVo = new PvsNumVo();
        pvsnumVo.setData(data);

        return pvsnumVo;
    }
}