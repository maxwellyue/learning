package com.maxwell.learning.modules.bus.vo;

import com.seentao.datacenter.common.utils.StringUtil;
import com.seentao.datacenter.modules.bus.entity.Order;

import java.util.ArrayList;
import java.util.List;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  上午10:01 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class OrderVo extends Order {

    private String productIds;//对应的产品id,如果对应多个产品，以逗号隔开

    private List<String> productIdList;

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public List<String> getProductIdList() {
        List<String> list = new ArrayList<>();
        if(!StringUtil.isBlank(productIds)){
            String[] productIdArray = productIds.split(",");
            for (String productId : productIdArray){
                list.add(productId);
            }
        }
        return list;
    }

}
