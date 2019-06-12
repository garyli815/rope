

import com.alibaba.fastjson.JSON;
import com.bmh.pojo.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.SolrDataQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-solr.xml")
public class SpringDataSolrTest {

    @Autowired
    private SolrTemplate solrTemplate;

    @Test
    public void testAdd(){
        TbItem tbItem = new TbItem();
        tbItem.setId(100L);
        tbItem.setTitle("测试数据 title");
        solrTemplate.saveBean(tbItem);  //saveOrUpdate 取决于索引中是否id
        solrTemplate.commit();
    }
    @Test
    public void testUpdate(){
        TbItem tbItem = new TbItem();
        tbItem.setId(101L);
        tbItem.setTitle("测试数据232323title");
        solrTemplate.saveBean(tbItem);  //saveOrUpdate 取决于索引中是否id
        solrTemplate.commit();
    }


/*    @Test
    public void testSearchById(){
        TbItem tbItem = solrTemplate.getById(100, TbItem.class);
        System.out.println(tbItem.getTitle());
    }*/

    @Test
    public void testSearch(){
        Query query = new SimpleQuery("item_title:测试"); //根据条件查询
        ScoredPage<TbItem> scoredPage = solrTemplate.queryForPage(query, TbItem.class);
        System.out.println(JSON.toJSONString(scoredPage,true));

        List<TbItem> tbItemList = scoredPage.getContent();
        for (TbItem tbItem : tbItemList) {
            System.out.println( tbItem.getTitle());
        }
    }
    @Test
    public void testDelete(){
//        solrTemplate.deleteById("1");  //根据id删除
//        SolrDataQuery solrDataQuery = new SimpleQuery("item_title:测试"); //根据条件删除
        SolrDataQuery solrDataQuery = new SimpleQuery("*:*");   //全删
        solrTemplate.delete(solrDataQuery);

        solrTemplate.commit();
    }



}
