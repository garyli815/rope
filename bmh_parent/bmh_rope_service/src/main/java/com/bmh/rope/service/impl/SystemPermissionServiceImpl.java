package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.PermissionMapper;
import com.bmh.pojo.Permission;
import com.bmh.pojo.PermissionExample;
import com.bmh.rope.service.SystemPermissionService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import utils.BCryptPasswordEncoderUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SystemPermissionServiceImpl implements SystemPermissionService {

    @Autowired
    private PermissionMapper usersMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Permission> findAll() {
        return usersMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Permission> page=   (Page<Permission>) usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Permission systemPermission) {
//		默认值
        usersMapper.insert(systemPermission);
    }


    /**
     * 修改
     */
    @Override
    public void update(Permission systemPermission){
        usersMapper.updateByPrimaryKey(systemPermission);
    }

    @Override
    public Permission findOne(String id) {
        return null;
    }



    /**
     * 批量删除
     */
    @Override
    public void delete(String[] ids) {
        for(String id:ids){
            usersMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(Permission systemPermission, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Permission> page= (Page<Permission>)usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void updateStatus(String status, String systemPermissionId) {

        Map paramMap = new HashMap<>();
        paramMap.put("status",status);
        paramMap.put("systemPermissionId",systemPermissionId);
    }

    @Override
    public Permission findByUserName(String username) {

        return null;

    }

}
