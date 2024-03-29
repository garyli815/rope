package com.bmh.rope.service;

import com.bmh.pojo.Permission;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SystemPermissionService {

    /**
     * 返回全部列表
     * @return
     */
    public List<Permission> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(Permission systemPermission);


    /**
     * 修改
     */
    public void update(Permission systemPermission);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Permission findOne(String id);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(String[] ids);

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(Permission systemPermission, int pageNum, int pageSize);

    void updateStatus(String status, String systemPermissionId);

    Permission findByUserName(String username);
}
