


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-redis.xml")
public class ValueTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testAdd(){
//        redisTemplate.boundValueOps("value_key").set("zhangsan");
        //30L                   long类型
        //TimeUnit.SECONDS      单位s
        redisTemplate.boundValueOps("value_key").set("zhangsan",30L, TimeUnit.SECONDS);

    }
    @Test
    public void testGet(){
        Object value = redisTemplate.boundValueOps("value_key").get();
        System.out.println(value);
    }
    @Test
    public void testDel(){
        redisTemplate.delete("value_key");
    }

}

