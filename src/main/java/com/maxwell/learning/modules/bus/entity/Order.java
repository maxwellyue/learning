package com.maxwell.learning.modules.bus.entity;

import com.seentao.datacenter.common.entity.BaseEntity;

import java.util.Date;
/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午4:03
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Order extends BaseEntity<Order>{
    private String id;

    private String originId;

    private String customerId;

    private String customerName;

    private Date createTime;

    private Date payTime;

    private Date authStartTime;

    private Date authEndTime;

    private Integer serverDead;

    private String region;

    private String industry;

    private String productCode;

    private String orderAmount;

    private String paidAmount;

    private String rebate;

    private String favorAmount;

    private Integer authUserCount;

    private String serverCode;

    private String serverName;

    private Integer status;

    private String businessType;

    private String saleDeptId;

    private String saleOrgId;

    private Date signTime;

    private String payCustomerId;

    private String useCustomerId;

    private Integer drawerCustomerId;

    private Integer commonStatus;

    private Boolean isSynchronized;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getAuthStartTime() {
        return authStartTime;
    }

    public void setAuthStartTime(Date authStartTime) {
        this.authStartTime = authStartTime;
    }

    public Date getAuthEndTime() {
        return authEndTime;
    }

    public void setAuthEndTime(Date authEndTime) {
        this.authEndTime = authEndTime;
    }

    public Integer getServerDead() {
        return serverDead;
    }

    public void setServerDead(Integer serverDead) {
        this.serverDead = serverDead;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount == null ? null : paidAmount.trim();
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate == null ? null : rebate.trim();
    }

    public String getFavorAmount() {
        return favorAmount;
    }

    public void setFavorAmount(String favorAmount) {
        this.favorAmount = favorAmount == null ? null : favorAmount.trim();
    }

    public Integer getAuthUserCount() {
        return authUserCount;
    }

    public void setAuthUserCount(Integer authUserCount) {
        this.authUserCount = authUserCount;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode == null ? null : serverCode.trim();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getSaleDeptId() {
        return saleDeptId;
    }

    public void setSaleDeptId(String saleDeptId) {
        this.saleDeptId = saleDeptId == null ? null : saleDeptId.trim();
    }

    public String getSaleOrgId() {
        return saleOrgId;
    }

    public void setSaleOrgId(String saleOrgId) {
        this.saleOrgId = saleOrgId == null ? null : saleOrgId.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getPayCustomerId() {
        return payCustomerId;
    }

    public void setPayCustomerId(String payCustomerId) {
        this.payCustomerId = payCustomerId == null ? null : payCustomerId.trim();
    }

    public String getUseCustomerId() {
        return useCustomerId;
    }

    public void setUseCustomerId(String useCustomerId) {
        this.useCustomerId = useCustomerId == null ? null : useCustomerId.trim();
    }

    public Integer getDrawerCustomerId() {
        return drawerCustomerId;
    }

    public void setDrawerCustomerId(Integer drawerCustomerId) {
        this.drawerCustomerId = drawerCustomerId;
    }

    public Integer getCommonStatus() {
        return commonStatus;
    }

    public void setCommonStatus(Integer commonStatus) {
        this.commonStatus = commonStatus;
    }

    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }
}