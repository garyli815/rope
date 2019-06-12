package com.bmh.rope.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController  //相当于controller+ResponseBody
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/showName")
    public Map showName(){
//        获取当前登录人名称
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map = new HashMap();
        map.put("name",name);
        return map;
    }

/*
    @RequestMapping("/showName2")
    public String showName2(){
//        获取当前登录人名称
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return name;
    }
*/

}
