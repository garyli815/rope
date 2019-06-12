package com.bmh.rope.service;

import com.bmh.pojo.Maintain;
import entity.PageResult;

import java.util.List;

public interface MaintainService {

    public List<Maintain> findAll();

    PageResult findPage(int pageNum, int pageSize);

    PageResult findPage(Maintain maintain, int pageNum, int pageSize);

    void add(Maintain maintain);

    Maintain fineOne(Long id);

    void update(Maintain maintain);

    void dele(Long[] ids);
}
