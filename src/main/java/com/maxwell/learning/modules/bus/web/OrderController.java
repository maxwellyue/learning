package com.maxwell.learning.modules.bus.web;

import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import com.seentao.datacenter.modules.bus.service.OrderService;
import com.seentao.datacenter.modules.bus.vo.OrderVo;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月15日 --  上午10:15 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/api/product/order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add")
    public JSONObject addOrder(@RequestBody OrderVo orderVo) {
        return orderService.addOrderAndRelation(orderVo) > 0 ?
                Result.success("添加订单成功") : Result.fail("添加订单失败");
    }


}
