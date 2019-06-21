package com.bmh.rope.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.Users;
import com.bmh.rope.service.SystemUsersService;
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
@RequestMapping("/systemUsers")
public class systemUsersController {

    @Reference
    private SystemUsersService systemUsersService;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Users> findAll(){
        return systemUsersService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return systemUsersService.findPage(page, rows);
    }

    /**
     * 增加
     * @param systemUsers
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Users systemUsers){
        try {
            systemUsersService.add(systemUsers);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param systemUsers
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Users systemUsers){
        try {
            systemUsersService.update(systemUsers);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 修改状态
     * @param
     * @return  return $http.get('../systemUsers/updateStatus/'+status+"/"+systemUsersId);
     */
    @RequestMapping("/updateStatus/{status}/{systemUsersId}")
    public Result updateStatus(@PathVariable String status,@PathVariable String systemUsersId){
        try {
            systemUsersService.updateStatus(status,systemUsersId);
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
    public Users findOne(@PathVariable String id){
        return systemUsersService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            systemUsersService.delete(ids);
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
    public PageResult search(@RequestBody Users systemUsers, int page, int rows  ){
        return systemUsersService.findPage(systemUsers, page, rows);
    }

}
