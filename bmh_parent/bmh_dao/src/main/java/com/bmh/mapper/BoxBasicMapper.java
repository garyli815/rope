package com.bmh.mapper;

import com.bmh.pojo.BoxBasic;
import com.bmh.pojo.BoxBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoxBasicMapper {
    int countByExample(BoxBasicExample example);

    int deleteByExample(BoxBasicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BoxBasic record);

    int insertSelective(BoxBasic record);

    List<BoxBasic> selectByExample(BoxBasicExample example);

    BoxBasic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BoxBasic record, @Param("example") BoxBasicExample example);

    int updateByExample(@Param("record") BoxBasic record, @Param("example") BoxBasicExample example);

    int updateByPrimaryKeySelective(BoxBasic record);

    int updateByPrimaryKey(BoxBasic record);
}