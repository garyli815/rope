package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.MaintainMapper;
import com.bmh.pojo.Maintain;
import com.bmh.pojo.MaintainExample;
import com.bmh.rope.service.MaintainService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MaintainServiceImpl implements MaintainService {

    @Autowired
    private MaintainMapper maintainMapper;
    @Override
    public List<Maintain> findAll() {
        return maintainMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) maintainMapper.selectByExample(null);
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(),page.getResult());
    }

    //带条件并且分页
    @Override
    public PageResult findPage(Maintain maintain, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        MaintainExample example = new MaintainExample();
        MaintainExample.Criteria criteria = example.createCriteria();

//        if (maintain.getBoxNum()!=null){
//            criteria.andBoxNumEqualTo(maintain.getBoxNum());
//        }
//
//        if (maintain.getHoldNum()!=null){
//            criteria.andHoldNumEqualTo(maintain.getHoldNum());
//        }

        Page page = (Page) maintainMapper.selectByExample(example);
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(Maintain maintain) {
        maintainMapper.insert(maintain);
    }

    @Override
    public Maintain fineOne(Long id) {
        return maintainMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Maintain maintain) {
        maintainMapper.updateByPrimaryKey(maintain);
    }

    @Override
    public void dele(Long[] ids) {
        for (Long id : ids) {
            maintainMapper.deleteByPrimaryKey(id);
        }

    }

}
