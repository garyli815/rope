package com.bmh.rope.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bmh.pojo.Role;
import com.bmh.rope.service.SystemRoleService;
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
@RequestMapping("/systemRole")
public class systemRoleController {

    @Reference
    private SystemRoleService systemRoleService;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Role> findAll(){
        return systemRoleService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return systemRoleService.findPage(page, rows);
    }

    /**
     * 增加
     * @param systemRole
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Role systemRole){
        try {
            systemRoleService.add(systemRole);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param systemRole
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Role systemRole){
        try {
            systemRoleService.update(systemRole);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 修改状态
     * @param
     * @return  return $http.get('../systemRole/updateStatus/'+status+"/"+systemRoleId);
     */
    @RequestMapping("/updateStatus/{status}/{systemRoleId}")
    public Result updateStatus(@PathVariable String status,@PathVariable String systemRoleId){
        try {
            systemRoleService.updateStatus(status,systemRoleId);
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
    public Role findOne(@PathVariable String id){
        return systemRoleService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            systemRoleService.delete(ids);
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
    public PageResult search(@RequestBody Role systemRole, int page, int rows  ){
        return systemRoleService.findPage(systemRole, page, rows);
    }

}
