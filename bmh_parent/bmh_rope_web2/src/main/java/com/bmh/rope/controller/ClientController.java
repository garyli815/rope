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
@RequestMapping("/client")
public class ClientController {

    @Reference
    private ClientService clientService;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Client> findAll(){
        return clientService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return clientService.findPage(page, rows);
    }

    /**
     * 增加
     * @param client
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Client client){
        try {
            clientService.add(client);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param client
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Client client){
        try {
            clientService.update(client);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 修改状态
     * @param
     * @return  return $http.get('../client/updateStatus/'+status+"/"+clientId);
     */
    @RequestMapping("/updateStatus/{status}/{clientId}")
    public Result updateStatus(@PathVariable String status,@PathVariable String clientId){
        try {
            clientService.updateStatus(status,clientId);
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
        return clientService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            clientService.delete(ids);
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
    public PageResult search(@RequestBody Client client, int page, int rows  ){
        return clientService.findPage(client, page, rows);
    }

}
