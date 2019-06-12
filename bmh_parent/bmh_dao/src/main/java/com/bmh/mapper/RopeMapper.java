package com.bmh.mapper;

import com.bmh.pojo.Rope;

import java.util.List;

public interface RopeMapper {
    public List<Rope> findAll();

    void insert(Rope rope);

    Rope findOne(Long id);

    void updateById(Rope rope);

    void deleteById(Long id);

    List<Rope> findPageByRope(Rope rope);
}
