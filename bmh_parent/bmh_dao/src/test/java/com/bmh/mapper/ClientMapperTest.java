package com.bmh.mapper;

import com.bmh.pojo.Client;
import com.bmh.pojo.Rope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:com/bmh/mapper/RopeMapper.xml", "classpath*:mybatis/SqlMapConfig.xml", "classpath*:spring/applicationContext-dao.xml"})

public class ClientMapperTest {
    @Autowired
    private ClientMapper clientMapper;




    @Test
    public void updateStatus() {
    Map map = new HashMap<>();
        map.put("status","1");
        map.put("clientId","22");
        clientMapper.updateStatus(map);
    }


}