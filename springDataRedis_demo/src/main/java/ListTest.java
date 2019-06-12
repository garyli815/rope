


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
public class ListTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testAdd(){
        redisTemplate.boundListOps("value_list").leftPush("zhangsan");
        redisTemplate.boundListOps("value_list").leftPush("lisi");
        redisTemplate.boundListOps("value_list").leftPush("wangwu");
        redisTemplate.boundListOps("value_list").leftPush("zhaoliu");
        redisTemplate.boundListOps("value_list").leftPush("zhangsan");
//        zhaoliu  wangwu   lisi zhangsan

    }
    @Test
    public void testGet(){
        List range = redisTemplate.boundListOps("value_list").range(0, 10);
        for (Object member : range) {
            System.out.println(member);
        }

    }
    @Test
    public void testDel(){
//        redisTemplate.delete("value_list");
        redisTemplate.boundListOps("value_list").remove(1,"zhangsan");  //shuzu.splice(index,shuliang)

    }

}
