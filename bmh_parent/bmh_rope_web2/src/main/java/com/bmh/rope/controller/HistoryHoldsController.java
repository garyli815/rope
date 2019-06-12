package com.bmh.rope.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.HistoryHolds;
import com.bmh.rope.service.HistoryHoldsService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //相当于controller+ResponseBody
@RequestMapping("holds")
public class HistoryHoldsController {

    @Reference
    private HistoryHoldsService historyHoldsService;

    @RequestMapping("/findAll")
    public List<HistoryHolds> findAll(){
        return historyHoldsService.findAll();
    }



    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize){
//        {total:100,rows:[{},{},{}]}
        return historyHoldsService.findPage(pageNum,pageSize);
    }

    @RequestMapping("/search")
    public PageResult search(int pageNum, int pageSize,@RequestBody HistoryHolds historyHolds){
//        {total:100,rows:[{},{},{}]}
        return historyHoldsService.findPage(historyHolds,pageNum,pageSize);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody HistoryHolds historyHolds){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            historyHoldsService.add(historyHolds);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }

    }
    @RequestMapping("/update")
    public Result update(@RequestBody HistoryHolds historyHolds){  //RequestBody接收 json数据
//        {success:true|false,message:"保存成功"|"保存失败"}
        try {
            historyHoldsService.update(historyHolds);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }

    }
    @RequestMapping("/dele")
    public Result dele(Long[] ids){  //RequestBody接收 json数据
        try {
            historyHoldsService.dele(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }

    }

    @RequestMapping("/findOne")
    public HistoryHolds findOne(Long id){
        return  historyHoldsService.fineOne(id);
    }


}
