package com.maxwell.learning.modules.bus.web;

import com.seentao.datacenter.common.utils.IdGen;
import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import com.seentao.datacenter.modules.bus.entity.Product;
import com.seentao.datacenter.modules.bus.service.ProductService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:23 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/api/product")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Product product) {
        product.setId(IdGen.uuid());
        productService.add(product);
        return Result.success("添加产品成功");
    }


}
