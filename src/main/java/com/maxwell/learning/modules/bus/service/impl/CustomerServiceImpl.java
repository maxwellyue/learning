package com.maxwell.learning.modules.bus.service.impl;

import com.seentao.datacenter.common.exception.BusinessException;
import com.seentao.datacenter.common.mapper.BeanMapper;
import com.seentao.datacenter.common.service.CrudServiceImpl;
import com.seentao.datacenter.common.utils.IdGen;
import com.seentao.datacenter.modules.bus.dao.CustomerDao;
import com.seentao.datacenter.modules.bus.dao.ProductCustomerDao;
import com.seentao.datacenter.modules.bus.entity.Customer;
import com.seentao.datacenter.modules.bus.entity.ProductCustomer;
import com.seentao.datacenter.modules.bus.service.CustomerService;
import com.seentao.datacenter.modules.bus.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:07 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
public class CustomerServiceImpl extends CrudServiceImpl<CustomerDao, Customer> implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private ProductCustomerDao customerRelationDao;

    /**
     * 添加客户
     * @param customerVo
     */
    @Override
    public void addCustomerAndRelation(CustomerVo customerVo) {

        if(true){
            throw new BusinessException("麻痹的你传数据的时候就不能认真点吗");
        }

        Customer customer = customerDao.getCustomerByName(customerVo.getName());

        //客户不存在，则新建客户基本信息
        if (customer == null) {
            customer = new Customer();
            BeanMapper.copy(customerVo, customer);
            customer.setId(IdGen.uuid());
            customerDao.add(customer);
        }

        ProductCustomer relation = new ProductCustomer();
        relation.setCreateTime(new Date());
        relation.setCustomerId(customer.getId());
        relation.setOriginId(customerVo.getOriginId());
        relation.setProductId(customerVo.getProductId());
        customerRelationDao.add(relation);

    }
}
