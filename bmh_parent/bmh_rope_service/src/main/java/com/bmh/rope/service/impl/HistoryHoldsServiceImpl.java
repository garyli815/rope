package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.HistoryHoldsMapper;
import com.bmh.pojo.HistoryHolds;
import com.bmh.pojo.HistoryHoldsExample;
import com.bmh.rope.service.HistoryHoldsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HistoryHoldsServiceImpl implements HistoryHoldsService {

    @Autowired
    private HistoryHoldsMapper historyHoldsMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<HistoryHolds> findAll() {
        return historyHoldsMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page page = (Page) historyHoldsMapper.selectByExample(null);
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(), page.getResult());
    }

    //带条件并且分页
    @Override
    public PageResult findPage(HistoryHolds historyHolds, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        HistoryHoldsExample example = new HistoryHoldsExample();
        HistoryHoldsExample.Criteria criteria = example.createCriteria();

        if (historyHolds.getBoxNum() != null) {
            criteria.andBoxNumEqualTo(historyHolds.getBoxNum());
        }

        if (historyHolds.getHoldNum() != null) {
            criteria.andHoldNumEqualTo(historyHolds.getHoldNum());
        }

        Page page = (Page) historyHoldsMapper.selectByExample(example);
//        page.getTotal()  总条数
//        page.getResult() 当前页的数据 list
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(HistoryHolds historyHolds) {
        historyHoldsMapper.insert(historyHolds);
    }

    @Override
    public HistoryHolds fineOne(Long id) {
        HistoryHolds historyHolds = (HistoryHolds) redisTemplate.boundHashOps("HistoryHolds").get(id);
        if (historyHolds == null) {
//			如果没有数据，从mysql查询
            //		select * from tb_content where category_id=?
            historyHolds = historyHoldsMapper.selectByPrimaryKey(id);
            redisTemplate.boundHashOps("HistoryHolds").put(id, historyHolds); //查询到数据后 需要放入到redis中
            System.out.println("data from MYSQL");
        } else {
            System.out.println("data from REDIS");
        }
        return historyHolds;


    }

    @Override
    public void update(HistoryHolds historyHolds) {
        historyHoldsMapper.updateByPrimaryKey(historyHolds);
    }

    @Override
    public void dele(Long[] ids) {
        for (Long id : ids) {
            historyHoldsMapper.deleteByPrimaryKey(id);
        }

    }

    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    public Map searchByParamMap(Map paramMap) {

        Object keyword = paramMap.get("keyword");
//        Query query = new SimpleQuery("item_title:"+keyword);
        Query query = null;
        if(keyword==null){
             query = new SimpleQuery("hold_keywords:*");
        }else {
             query = new SimpleQuery(new Criteria("hold_keywords").is(keyword));
        }

        ScoredPage<HistoryHolds> scoredPage = solrTemplate.queryForPage(query, HistoryHolds.class);

        List<HistoryHolds> holdList = scoredPage.getContent();
        Map resultMap = new HashMap();
        resultMap.put("holdList",holdList);  //当前页的列表数据
        resultMap.put("total",scoredPage.getTotalElements()); //根据关键字查询的总记录数
        return resultMap;
    }

}
