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
public class ProdProductUser extends BaseEntity<ProdProductUser>{

    private Integer id;

    private String originId;

    private String name;

    private String email;

    private String mobilePhone;

    private Date registerDate;

    private Boolean isEmailValidate;

    private Boolean isPhoneValidate;

    private Boolean isIdcardValidate;

    private Boolean isPaid;

    private String sortKey;

    private String password;

    private String terminalType;

    private Date payTime;

    private Date payEndTime;

    private String status;

    private Boolean isSynchronized;

    private String productId;

    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Boolean getIsEmailValidate() {
        return isEmailValidate;
    }

    public void setIsEmailValidate(Boolean isEmailValidate) {
        this.isEmailValidate = isEmailValidate;
    }

    public Boolean getIsPhoneValidate() {
        return isPhoneValidate;
    }

    public void setIsPhoneValidate(Boolean isPhoneValidate) {
        this.isPhoneValidate = isPhoneValidate;
    }

    public Boolean getIsIdcardValidate() {
        return isIdcardValidate;
    }

    public void setIsIdcardValidate(Boolean isIdcardValidate) {
        this.isIdcardValidate = isIdcardValidate;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey == null ? null : sortKey.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}