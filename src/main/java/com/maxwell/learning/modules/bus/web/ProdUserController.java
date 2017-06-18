package com.maxwell.learning.modules.bus.web;

import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import com.seentao.datacenter.modules.bus.service.ProdUserService;
import com.seentao.datacenter.modules.bus.vo.ProdUserVo;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月15日 --  上午10:07 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/api/product/user")
public class ProdUserController extends BaseController{

    @Autowired
    private ProdUserService prodUserService;

    @RequestMapping("/add")
    public JSONObject addProdUser(@RequestBody ProdUserVo prodUserVo){
        return prodUserService.addProdUserRelation(prodUserVo) ? Result.success("添加用户成功"):Result.fail("添加用户失败");
    }

}
