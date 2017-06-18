package com.maxwell.learning.modules.bus.service;

import com.seentao.datacenter.common.service.CrudService;
import com.seentao.datacenter.modules.bus.entity.Order;
import com.seentao.datacenter.modules.bus.vo.OrderVo;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:04 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public interface OrderService extends CrudService<Order> {
    int addOrderAndRelation(OrderVo orderVo);
}
