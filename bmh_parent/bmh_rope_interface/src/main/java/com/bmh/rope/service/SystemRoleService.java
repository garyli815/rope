package com.bmh.rope.service;

import com.bmh.pojo.Role;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SystemRoleService {

    /**
     * 返回全部列表
     * @return
     */
    public List<Role> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(Role systemRole);


    /**
     * 修改
     */
    public void update(Role systemRole);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Role findOne(String id);


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
    public PageResult findPage(Role systemRole, int pageNum, int pageSize);

    void updateStatus(String status, String systemRoleId);

    Role findByUserName(String username);
}
