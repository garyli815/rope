package com.bmh.rope.service;

import com.bmh.pojo.HistoryHolds;
import entity.PageResult;

import java.util.List;
import java.util.Map;

public interface HistoryHoldsService {

    public List<HistoryHolds> findAll();

    PageResult findPage(int pageNum, int pageSize);

    PageResult findPage(HistoryHolds historyHolds, int pageNum, int pageSize);

    void add(HistoryHolds historyHolds);

    HistoryHolds fineOne(Long id);

    void update(HistoryHolds historyHolds);

    void dele(Long[] ids);

    Map searchByParamMap(Map paramMap);
}
