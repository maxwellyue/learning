package com.maxwell.learning.modules.bus.entity;

import com.seentao.datacenter.common.entity.BaseEntity;
/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午4:03
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Product extends BaseEntity<Product> {
    private String id;

    private String name;

    private String orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}