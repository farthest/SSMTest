package com.ssm.api;

import com.alibaba.fastjson.JSONObject;
import com.ssm.vo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class TextRestful {

    @RequestMapping(value="/restful",produces="text/plain;charset=UTF-8")
    public @ResponseBody
    String info() {
        return "test";
    }

    // localhost:8080/项目名/restful/1.do
    @RequestMapping(value="/restful/{id}.do",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    public @ResponseBody
    Object add(Emp vo){
//        log.info("数据增加成功："+vo);
        JSONObject js = new JSONObject();
        js.put("flag", true);
        return js;
    }

    @RequestMapping(value="/restful",method=RequestMethod.PUT,produces="application/json;charset=UTF-8")
    public @ResponseBody Object edit(Emp vo){
//        log.info("数据更新成功："+vo);
        JSONObject js = new JSONObject();
        js.put("flag", true);
        return js;
    }

    @RequestMapping(value="/restful",method=RequestMethod.DELETE,produces="application/json;charset=UTF-8")
    public @ResponseBody Object remove(int mid){
//        log.info("要删除的是："+mid);
        JSONObject js = new JSONObject();
        js.put("flag", true);
        return js;
    }
    @RequestMapping(value="/restful/{mid:\\d+}",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
    public @ResponseBody Object get(@PathVariable("mid") int mid){
//        log.info("要查看的是："+mid);
        Emp vo = new Emp();
        vo.setEmpno(mid);
        vo.setEname("SMITH");
        vo.setSal(1.1);
        vo.setHiredate(new Date());
        JSONObject js = new JSONObject();
        js.put("emp", vo);
        return js;
    }

    @RequestMapping(value="/restful/{condition}",method=RequestMethod.PATCH,produces="application/json;charset=UTF-8")
    public @ResponseBody Object list(@PathVariable("condition") String param){
//        log.info("查看的是："+param);
        int currentPage = 4;
        int lineSize = 5;
        List<Emp> all = new ArrayList<Emp>() ;
        for (int x = ((currentPage-1)*lineSize);x< currentPage *lineSize; x ++) {
            Emp vo = new Emp() ;
            vo.setEmpno(x);
            vo.setEname("姓名 - " + x);
            vo.setSal(10000.0 + x);
            vo.setHiredate(new Date());
            all.add(vo) ;
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("allEmps", all);
        return map;
    }

}