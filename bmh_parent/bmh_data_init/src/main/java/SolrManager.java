
import com.alibaba.fastjson.JSON;
import com.bmh.mapper.HistoryHoldsMapper;
import com.bmh.mapper.TbItemMapper;
import com.bmh.pojo.HistoryHolds;
import com.bmh.pojo.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext*.xml")
public class SolrManager {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private TbItemMapper tbItemMapper;

    @Autowired
    private HistoryHoldsMapper historyHoldsMapper;

    //    初始化的所有sku数据  1
/*    @Test
    public void initSolrData(){
//  1、从mysql中查询所有的sku数据
        List<TbItem> itemList = tbItemMapper.selectByExample(null);
        solrTemplate.saveBeans(itemList);
        solrTemplate.commit();
    }*/

    @Test
    public void initSolrData(){
//  1、从mysql中查询所有的sku数据
        List<TbItem> itemList = tbItemMapper.selectByExample(null);
        for (TbItem tbItem:itemList) {
//            spec:{"网络":"电信4G","机身内存":"64G"}--->item_spec_网络:电信4G  item_spec_机身内存:64G
//            spec:{"水杯材质":"不锈钢","水杯容量":"800ml"}--->item_spec_水杯材质:不锈钢  item_spec_水杯容量:800ml
            String spec = tbItem.getSpec();
            Map<String,String> specMap = JSON.parseObject(spec, Map.class);
            tbItem.setSpecMap(specMap);

        }

        solrTemplate.saveBeans(itemList);
        solrTemplate.commit();
    }

    @Test
    public void initSolrData2(){
        List<HistoryHolds> holdList = historyHoldsMapper.selectByExample(null);
        solrTemplate.saveBeans(holdList);
        solrTemplate.commit();
    }





}
