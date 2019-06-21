package com.bmh.mapper;

import com.alibaba.fastjson.JSON;
import com.bmh.pojo.Client;
import com.bmh.pojo.Rope;
import com.bmh.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:com/bmh/mapper/*.xml", "classpath*:mybatis/SqlMapConfig.xml", "classpath*:spring/applicationContext-dao.xml"})

public class ClientMapperTest {
    @Autowired
    private UsersMapper usersMapper;




    @Test
    public void updateStatus() {

/*        Users one = usersMapper.findOne("4");


        System.out.println(one.toString());*/

    }


}