package com.bmh.rope.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.bmh.pojo.Rope;
import com.bmh.rope.service.RopeService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //相当于controller+ResponseBody
@RequestMapping("rope")
public class RopeController {

    @Reference
    private RopeService ropeService;

    @RequestMapping("/findAll")
    public List<Rope> findAll(){
        return ropeService.findAll();
    }



    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize){
//        {total:100,rows:[{},{},{}]}
        return ropeService.findPage(pageNum,pageSize);
    }

    @RequestMapping("/search")
    public PageResult search(int pageNum, int pageSize,@RequestBody Rope rope){
//        {total:100,rows:[{},{},{}]}
        return ropeService.findPage(rope,pageNum,pageSize);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Rope rope){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            ropeService.add(rope);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }

    }
    @RequestMapping("/update")
    public Result update(@RequestBody Rope rope){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            ropeService.update(rope);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }

    }
    @RequestMapping("/dele")
    public Result dele(Long[] ids){  //RequestBody接收 json数据
        try {
            ropeService.dele(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }

    }

    @RequestMapping("/findOne")
    public Rope findOne(Long id){
        return  ropeService.fineOne(id);
    }


}
