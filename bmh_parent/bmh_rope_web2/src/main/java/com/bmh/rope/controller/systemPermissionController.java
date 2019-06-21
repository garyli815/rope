package com.bmh.rope.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.Permission;
import com.bmh.rope.service.SystemPermissionService;
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
@RequestMapping("/systemPermission")
public class systemPermissionController {

    @Reference
    private SystemPermissionService systemPermissionService;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Permission> findAll(){
        return systemPermissionService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return systemPermissionService.findPage(page, rows);
    }

    /**
     * 增加
     * @param systemPermission
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Permission systemPermission){
        try {
            systemPermissionService.add(systemPermission);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param systemPermission
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Permission systemPermission){
        try {
            systemPermissionService.update(systemPermission);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 修改状态
     * @param
     * @return  return $http.get('../systemPermission/updateStatus/'+status+"/"+systemPermissionId);
     */
    @RequestMapping("/updateStatus/{status}/{systemPermissionId}")
    public Result updateStatus(@PathVariable String status,@PathVariable String systemPermissionId){
        try {
            systemPermissionService.updateStatus(status,systemPermissionId);
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
    public Permission findOne(@PathVariable String id){
        return systemPermissionService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            systemPermissionService.delete(ids);
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
    public PageResult search(@RequestBody Permission systemPermission, int page, int rows  ){
        return systemPermissionService.findPage(systemPermission, page, rows);
    }

}
