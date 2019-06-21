package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.UsersMapper;
import com.bmh.pojo.Client;
import com.bmh.pojo.ClientExample;
import com.bmh.pojo.Users;
import com.bmh.pojo.UsersExample;

import com.bmh.rope.service.SystemUsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import utils.BCryptPasswordEncoderUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SystemUsersServiceImpl implements SystemUsersService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Users> findAll() {
        return usersMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Users> page=   (Page<Users>) usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Users systemUsers) {
        systemUsers.setPassword(BCryptPasswordEncoderUtils.encodePassword(systemUsers.getPassword()));
//		默认值
        usersMapper.insert(systemUsers);
    }


    /**
     * 修改
     */
    @Override
    public void update(Users systemUsers){
        usersMapper.updateByPrimaryKey(systemUsers);
    }

    @Override
    public Users findOne(String id) {
        return usersMapper.findOne(id);
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
    public PageResult findPage(Users systemUsers, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Users> page= (Page<Users>)usersMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void updateStatus(String status, String systemUsersId) {

        Map paramMap = new HashMap<>();
        paramMap.put("status",status);
        paramMap.put("systemUsersId",systemUsersId);
    }

    @Override
    public Users findByUserName(String username) {

        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Users> users = usersMapper.selectByExample(example);
        Users users1 = users.get(0);
        return users1;

    }

}
