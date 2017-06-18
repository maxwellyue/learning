package com.maxwell.learning.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maxwell.learning.common.dao.Page;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/************************************************************************************
 * 文件功能描述：实体类的基类
 * 创建人：岳增存
 * 创建时间： 2017年04月27日 --  19:24 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public abstract class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = -404374024291318755L;

    //分页对象：只是在mybatis分页（拦截实现）中才用到，该属性无需返回到前端
    protected Page<T> page;

    //前端传值用,方便直接将分页参数与实体属性一起序列化为实体
    protected int pageNumber;
    protected int pageSize;

    //上传数据时用于验证身份：相当于账号和密码
    private String orgId;
    private String orgAuthCertification;

    @JsonIgnore
    public Page<T> getPage() {
        return page;
    }

    public void setPage(Page<T> page) {
        this.page = page;
    }

    @JsonIgnore
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    @JsonIgnore
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @JsonIgnore
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonIgnore
    public String getOrgAuthCertification() {
        return orgAuthCertification;
    }

    public void setOrgAuthCertification(String orgAuthCertification) {
        this.orgAuthCertification = orgAuthCertification;
    }
}
