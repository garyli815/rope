package com.bmh.mapper;

import com.bmh.pojo.HistoryHolds;
import com.bmh.pojo.HistoryHoldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryHoldsMapper {
    int countByExample(HistoryHoldsExample example);

    int deleteByExample(HistoryHoldsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HistoryHolds record);

    int insertSelective(HistoryHolds record);

    List<HistoryHolds> selectByExample(HistoryHoldsExample example);

    HistoryHolds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HistoryHolds record, @Param("example") HistoryHoldsExample example);

    int updateByExample(@Param("record") HistoryHolds record, @Param("example") HistoryHoldsExample example);

    int updateByPrimaryKeySelective(HistoryHolds record);

    int updateByPrimaryKey(HistoryHolds record);
}