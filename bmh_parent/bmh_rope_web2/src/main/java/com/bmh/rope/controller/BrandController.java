package com.bmh.rope.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.bmh.pojo.TbBrand;
import com.bmh.rope.service.BrandService;
import entity.PageResult;
import entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//brand/findAll
//@Controller
@RequestMapping("/brand")
@RestController  //相当于controller+ResponseBody
public class BrandController {

    //    @Autowired 从本项目加载
//    @Reference  远程调用war包的类
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
//    @ResponseBody //转json  回显到浏览器上
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }





}
