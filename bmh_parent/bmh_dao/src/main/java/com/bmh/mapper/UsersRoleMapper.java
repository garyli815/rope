package com.bmh.mapper;

import com.bmh.pojo.UsersRoleExample;
import com.bmh.pojo.UsersRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersRoleMapper {
    int countByExample(UsersRoleExample example);

    int deleteByExample(UsersRoleExample example);

    int deleteByPrimaryKey(UsersRoleKey key);

    int insert(UsersRoleKey record);

    int insertSelective(UsersRoleKey record);

    List<UsersRoleKey> selectByExample(UsersRoleExample example);

    int updateByExampleSelective(@Param("record") UsersRoleKey record, @Param("example") UsersRoleExample example);

    int updateByExample(@Param("record") UsersRoleKey record, @Param("example") UsersRoleExample example);
}