package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.RopeMapper;
import com.bmh.pojo.Rope;
import com.bmh.rope.service.RopeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RopeServiceImpl implements RopeService {

    @Autowired
    private RopeMapper ropeMapper;
    @Override
    public List<Rope> findAll() {
        return ropeMapper.findAll();
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) ropeMapper.findAll();
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult findPage(Rope rope, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) ropeMapper.findPageByRope(rope);
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(Rope rope) {
        ropeMapper.insert(rope);
    }

    @Override
    public Rope fineOne(Long id) {
        return ropeMapper.findOne(id);
    }

    @Override
    public void update(Rope rope) {
        ropeMapper.updateById(rope);
    }

    @Override
    public void dele(Long[] ids) {
        for (Long id : ids) {
            ropeMapper.deleteById(id);
        }

    }

}
