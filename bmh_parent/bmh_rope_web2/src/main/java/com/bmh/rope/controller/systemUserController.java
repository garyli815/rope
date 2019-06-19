package com.bmh.rope.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.Client;
import com.bmh.rope.service.ClientService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/systemUser")
public class systemUserController {

    @Reference
    private ClientService systemUserService;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Client> findAll(){
        return systemUserService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return systemUserService.findPage(page, rows);
    }

    /**
     * 增加
     * @param systemUser
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Client systemUser){
        try {
            systemUserService.add(systemUser);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param systemUser
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Client systemUser){
        try {
            systemUserService.update(systemUser);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 修改状态
     * @param
     * @return  return $http.get('../systemUser/updateStatus/'+status+"/"+systemUserId);
     */
    @RequestMapping("/updateStatus/{status}/{systemUserId}")
    public Result updateStatus(@PathVariable String status,@PathVariable String systemUserId){
        try {
            systemUserService.updateStatus(status,systemUserId);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne/{id}")
    public Client findOne(@PathVariable String id){
        return systemUserService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            systemUserService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     * @param
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Client systemUser, int page, int rows  ){
        return systemUserService.findPage(systemUser, page, rows);
    }

}
