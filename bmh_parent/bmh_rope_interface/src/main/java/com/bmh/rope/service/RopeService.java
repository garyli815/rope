package com.bmh.rope.service;

import com.bmh.pojo.Rope;
import entity.PageResult;

import java.util.List;

public interface RopeService {

    public List<Rope> findAll();

    PageResult findPage(int pageNum, int pageSize);

    PageResult findPage(Rope rope, int pageNum, int pageSize);

    void add(Rope rope);

    Rope fineOne(Long id);

    void update(Rope rope);

    void dele(Long[] ids);
}
