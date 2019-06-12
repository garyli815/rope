package com.bmh.rope.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.Maintain;
import com.bmh.rope.service.MaintainService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //相当于controller+ResponseBody
@RequestMapping("maintain")
public class MaintainController {

    @Reference
    private MaintainService maintainService;

    @RequestMapping("/findAll")
    public List<Maintain> findAll(){
        return maintainService.findAll();
    }



    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize){
//        {total:100,rows:[{},{},{}]}
        return maintainService.findPage(pageNum,pageSize);
    }

    @RequestMapping("/search")
    public PageResult search(int pageNum, int pageSize,@RequestBody Maintain maintain){
//        {total:100,rows:[{},{},{}]}
        return maintainService.findPage(maintain,pageNum,pageSize);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Maintain maintain){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            maintainService.add(maintain);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }

    }
    @RequestMapping("/update")
    public Result update(@RequestBody Maintain maintain){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            maintainService.update(maintain);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }

    }
    @RequestMapping("/dele")
    public Result dele(Long[] ids){  //RequestBody接收 json数据
        try {
            maintainService.dele(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }

    }

    @RequestMapping("/findOne")
    public Maintain findOne(Long id){
        return  maintainService.fineOne(id);
    }


}
