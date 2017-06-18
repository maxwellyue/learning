package com.maxwell.learning.modules.bus.service.impl;

import com.seentao.datacenter.common.service.CrudServiceImpl;
import com.seentao.datacenter.modules.bus.dao.ProductDao;
import com.seentao.datacenter.modules.bus.entity.Product;
import com.seentao.datacenter.modules.bus.service.ProductService;
import org.springframework.stereotype.Service;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:07 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
public class ProductServiceImpl extends CrudServiceImpl<ProductDao, Product> implements ProductService {
}
