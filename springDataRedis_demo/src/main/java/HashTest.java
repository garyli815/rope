
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-redis.xml")
public class HashTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testAdd(){
        redisTemplate.boundHashOps("value_hash").put("a","AAAA");
        redisTemplate.boundHashOps("value_hash").put("b","BBBB");
        redisTemplate.boundHashOps("value_hash").put("c","CCCC");
        redisTemplate.boundHashOps("value_hash").put("d","DDDD");

    }
    @Test
    public void testGet(){
        Set value_hash = redisTemplate.boundHashOps("value_hash").keys();
        for (Object key : value_hash) {
//            System.out.println(key);
            Object valueHash = redisTemplate.boundHashOps("value_hash").get(key);
            System.out.println(valueHash);
        }

    }
    @Test
    public void testDel(){
//        redisTemplate.delete("value_hash");
        redisTemplate.boundHashOps("value_hash").delete("c");

    }

}
