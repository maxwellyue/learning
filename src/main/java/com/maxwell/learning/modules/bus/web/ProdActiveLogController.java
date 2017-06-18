package com.maxwell.learning.modules.bus.web;

import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import com.seentao.datacenter.modules.bus.entity.ProdActiveLog;
import com.seentao.datacenter.modules.bus.service.ProdActiveLogService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  上午10:44 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/api/product/log")
public class ProdActiveLogController extends BaseController {

    @Autowired
    private ProdActiveLogService prodActiveLogService;

    public JSONObject add(@RequestBody ProdActiveLog prodActiveLog) {
        prodActiveLogService.add(prodActiveLog);
        return Result.success("添加活跃数据成功");
    }

}
