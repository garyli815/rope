
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-redis.xml")
public class SetTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testAdd(){
        redisTemplate.boundSetOps("value_set").add("zhangsan");
        redisTemplate.boundSetOps("value_set").add("lisi");
        redisTemplate.boundSetOps("value_set").add("wangwu");
        redisTemplate.boundSetOps("value_set").add("zhaoliu");
    }
    @Test
    public void testGet(){
        Set members = redisTemplate.boundSetOps("value_set").members();
        for (Object member : members) {
            System.out.println(member);
        }

    }
    @Test
    public void testDel(){
//        redisTemplate.delete("value_set");
        redisTemplate.boundSetOps("value_set").remove("lisi");

    }

}
