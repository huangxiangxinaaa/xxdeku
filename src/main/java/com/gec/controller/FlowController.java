package com.gec.controller;

import com.gec.pojo.AvgPvsVo;
import com.gec.pojo.ResultVo;
import com.gec.pojo.VNumVo;
import com.gec.pojo.PvsNumVo;
import com.gec.service.FlowService;
import com.gec.service.impl.FlowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //表示这个类是控制层的类 让spring创建对象
public class FlowController {
    //获取业务层对象
    @Autowired  //注入对象  DI 依赖注入
    FlowService flowService;

    @RequestMapping("/pvsNum")
    @ResponseBody    //以json格式返回
    public ResultVo findPvs(){
        System.out.println("获取9.18-9.24的pvs");
        //获取数据
        //封装数据
        //调用service层的方法
        ResultVo resultVo=flowService.getPvs("2013-09-18","2013-09-24");

        //响应数据
        return resultVo;
    }

    @RequestMapping("/avgPvNum")  //请求映射   访问的路径
    @ResponseBody     //以json格式返回数据
    public AvgPvsVo findAvgPvs(){
        System.out.println("获取9.18-9.24的pvs");
        //获取数据
        //封装数据
        //调用service层的方法
        AvgPvsVo avgPvsVo = flowService.getAvgPvs("2013-09-18", "2013-09-24");
        //响应数据
        return avgPvsVo;
    }

    @RequestMapping("/flowNum")  //请求映射   访问的路径
    @ResponseBody     //以json格式返回数据
    public VNumVo findNum(){
        System.out.println("获取9.18-9.24的num");
        //获取数据
        //封装数据
        //调用service层的方法
        VNumVo vnumVo = flowService.getVNum("2013-09-18", "2013-09-24");
        //响应数据
        return vnumVo;
    }

    @RequestMapping("/pvsNumAddr")
    @ResponseBody    //以json格式返回
    public PvsNumVo findnumPvs(){
        System.out.println("获取9.18-9.24的pvs");
        //获取数据
        //封装数据
        //调用service层的方法
        PvsNumVo pvsnumVo=flowService.getPvsnum("2013-09-18","2013-09-24");

        //响应数据
        return pvsnumVo;
    }
}
