package com.maxwell.learning.modules.bus.vo;

import com.seentao.datacenter.modules.bus.entity.Customer;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月15日 --  上午9:06 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class CustomerVo extends Customer{
    @NotBlank(message = "客户编码不能为空")
    private String originId;
    @NotBlank(message = "产品编码不能为空")
    private String productId;

    private Date createData;

    public String getOriginId() {
        return this.originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return this.productId;
    }

    public Date getCreateTime() {
        return this.createData;
    }

    public void setCreateTime(Date createData) {
        this.createData = createData;
    }
}
