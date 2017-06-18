package com.maxwell.learning.modules.bus.web;

import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import com.seentao.datacenter.modules.bus.service.CustomerService;
import com.seentao.datacenter.modules.bus.vo.CustomerVo;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月15日 --  上午8:35 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/api/product/customer")
public class CustomerController extends BaseController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/add")
    public JSONObject addCustomer(@RequestBody @Validated CustomerVo customerVo) {
        customerService.addCustomerAndRelation(customerVo);
        return Result.success("添加客户成功");
    }


}
