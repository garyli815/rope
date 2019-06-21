package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.RoleMapper;
import com.bmh.pojo.Role;
import com.bmh.pojo.RoleExample;
import com.bmh.rope.service.SystemRoleService;
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
public class SystemRoleServiceImpl implements SystemRoleService {

    @Autowired
    private RoleMapper usersMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Role> findAll() {
        return usersMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Role> page=   (Page<Role>) usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Role systemRole) {
//		默认值
        usersMapper.insert(systemRole);
    }


    /**
     * 修改
     */
    @Override
    public void update(Role systemRole){
        usersMapper.updateByPrimaryKey(systemRole);
    }

    @Override
    public Role findOne(String id) {
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
    public PageResult findPage(Role systemRole, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Role> page= (Page<Role>)usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void updateStatus(String status, String systemRoleId) {

        Map paramMap = new HashMap<>();
        paramMap.put("status",status);
        paramMap.put("systemRoleId",systemRoleId);
    }

    @Override
    public Role findByUserName(String username) {

       /* RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Role> users = usersMapper.selectByExample(example);
        Role users1 = users.get(0);*/
        return null;

    }

}
