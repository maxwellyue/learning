package com.maxwell.learning.modules.bus.service.impl;

import com.seentao.datacenter.common.mapper.BeanMapper;
import com.seentao.datacenter.common.service.CrudServiceImpl;
import com.seentao.datacenter.common.utils.Collections3;
import com.seentao.datacenter.common.utils.IdGen;
import com.seentao.datacenter.modules.bus.dao.OrderDao;
import com.seentao.datacenter.modules.bus.dao.ProductOrderDao;
import com.seentao.datacenter.modules.bus.entity.Order;
import com.seentao.datacenter.modules.bus.entity.ProductOrder;
import com.seentao.datacenter.modules.bus.service.OrderService;
import com.seentao.datacenter.modules.bus.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:07 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
public class OrderServiceImpl extends CrudServiceImpl<OrderDao, Order> implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductOrderDao productOrderDao;


    @Transactional
    @Override
    public int addOrderAndRelation(OrderVo orderVo) {
        //添加订单信息
        Order order = new Order();
        BeanMapper.copy(orderVo, order);
        order.setId(IdGen.uuid());
        orderDao.add(order);

        //添加订单和产品之间的对应关系
        List<String> productIdList = orderVo.getProductIdList();
        if (!Collections3.isEmpty(productIdList)){
            List<ProductOrder> productOrders = new ArrayList<ProductOrder>();
            for (String productId : productIdList){
                ProductOrder productOrder = new ProductOrder();
                productOrder.setOrderId(order.getId());
                productOrder.setProductId(productId);
                productOrders.add(productOrder);
            }
            return productOrderDao.addBatch(productOrders);
        }
        return 0;
    }
}
