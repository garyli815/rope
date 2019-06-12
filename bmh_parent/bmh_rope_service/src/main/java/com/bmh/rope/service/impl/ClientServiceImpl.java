package com.bmh.rope.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bmh.mapper.ClientMapper;
import com.bmh.pojo.Client;
import com.bmh.pojo.ClientExample;
import com.bmh.rope.service.ClientService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Client> findAll() {
        return clientMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Client> page=   (Page<Client>) clientMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Client client) {
//		默认值
        client.setStatus("0");
        client.setCreateTime(new Date());
//		密码加密   springSecurirty 加密方式
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode(client.getPassword());
        client.setPassword(password);
        clientMapper.insert(client);
    }


    /**
     * 修改
     */
    @Override
    public void update(Client client){
        clientMapper.updateByPrimaryKey(client);
    }

    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    @Override
    public Client findOne(String id){
        return clientMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(String[] ids) {
        for(String id:ids){
            clientMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(Client client, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        ClientExample example=new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria();

        if(client!=null){
            if(client.getClientId()!=null && client.getClientId().length()>0){
                criteria.andClientIdLike("%"+client.getClientId()+"%");
            }
            if(client.getName()!=null && client.getName().length()>0){
                criteria.andNameLike("%"+client.getName()+"%");
            }
            if(client.getNickName()!=null && client.getNickName().length()>0){
                criteria.andNickNameLike("%"+client.getNickName()+"%");
            }
            if(client.getPassword()!=null && client.getPassword().length()>0){
                criteria.andPasswordLike("%"+client.getPassword()+"%");
            }
            if(client.getEmail()!=null && client.getEmail().length()>0){
                criteria.andEmailLike("%"+client.getEmail()+"%");
            }
            if(client.getMobile()!=null && client.getMobile().length()>0){
                criteria.andMobileLike("%"+client.getMobile()+"%");
            }
            if(client.getTelephone()!=null && client.getTelephone().length()>0){
                criteria.andTelephoneLike("%"+client.getTelephone()+"%");
            }
            if(client.getStatus()!=null && client.getStatus().length()>0){
                criteria.andStatusLike("%"+client.getStatus()+"%");
            }
            if(client.getAddressDetail()!=null && client.getAddressDetail().length()>0){
                criteria.andAddressDetailLike("%"+client.getAddressDetail()+"%");
            }
            if(client.getLinkmanName()!=null && client.getLinkmanName().length()>0){
                criteria.andLinkmanNameLike("%"+client.getLinkmanName()+"%");
            }
            if(client.getLinkmanQq()!=null && client.getLinkmanQq().length()>0){
                criteria.andLinkmanQqLike("%"+client.getLinkmanQq()+"%");
            }
            if(client.getLinkmanMobile()!=null && client.getLinkmanMobile().length()>0){
                criteria.andLinkmanMobileLike("%"+client.getLinkmanMobile()+"%");
            }
            if(client.getLinkmanEmail()!=null && client.getLinkmanEmail().length()>0){
                criteria.andLinkmanEmailLike("%"+client.getLinkmanEmail()+"%");
            }
            if(client.getLicenseNumber()!=null && client.getLicenseNumber().length()>0){
                criteria.andLicenseNumberLike("%"+client.getLicenseNumber()+"%");
            }
            if(client.getTaxNumber()!=null && client.getTaxNumber().length()>0){
                criteria.andTaxNumberLike("%"+client.getTaxNumber()+"%");
            }
            if(client.getOrgNumber()!=null && client.getOrgNumber().length()>0){
                criteria.andOrgNumberLike("%"+client.getOrgNumber()+"%");
            }
            if(client.getLogoPic()!=null && client.getLogoPic().length()>0){
                criteria.andLogoPicLike("%"+client.getLogoPic()+"%");
            }
            if(client.getBrief()!=null && client.getBrief().length()>0){
                criteria.andBriefLike("%"+client.getBrief()+"%");
            }
            if(client.getLegalPerson()!=null && client.getLegalPerson().length()>0){
                criteria.andLegalPersonLike("%"+client.getLegalPerson()+"%");
            }
            if(client.getLegalPersonCardId()!=null && client.getLegalPersonCardId().length()>0){
                criteria.andLegalPersonCardIdLike("%"+client.getLegalPersonCardId()+"%");
            }
            if(client.getBankUser()!=null && client.getBankUser().length()>0){
                criteria.andBankUserLike("%"+client.getBankUser()+"%");
            }
            if(client.getBankName()!=null && client.getBankName().length()>0){
                criteria.andBankNameLike("%"+client.getBankName()+"%");
            }

        }

        Page<Client> page= (Page<Client>)clientMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void updateStatus(String status, String clientId) {

		/*Client tbClient = clientMapper.selectByPrimaryKey(clientId);
		tbClient.setStatus(status);
		clientMapper.updateByPrimaryKey(tbClient);*/
//		update tb_client set status =? where client_id=?
        Map paramMap = new HashMap<>();
        paramMap.put("status",status);
        paramMap.put("clientId",clientId);
        clientMapper.updateStatus(paramMap);
    }

}
