package com.bmh.mapper;

import com.bmh.pojo.TbBrand;

import java.util.List;

public interface TbBrandMapper {
    public List<TbBrand> findAll();

    void insert(TbBrand brand);

    TbBrand findOne(Long id);

    void updateById(TbBrand brand);

    void deleteById(Long id);
}
