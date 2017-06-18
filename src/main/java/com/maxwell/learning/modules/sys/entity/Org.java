package com.maxwell.learning.modules.sys.entity;

import com.seentao.datacenter.common.entity.BaseEntity;
/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午4:03
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Org extends BaseEntity<Org> {
    private String id;

    private String name;

    private Integer type;

    private String parentId;

    private Integer status;

    private String leaderId;

    private String authCertificate;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getAuthCertificate() {
        return authCertificate;
    }

    public void setAuthCertificate(String authCertificate) {
        this.authCertificate = authCertificate == null ? null : authCertificate.trim();
    }
}