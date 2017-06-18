package com.maxwell.learning.modules.bus.vo;

import com.seentao.datacenter.modules.bus.entity.ProdProductUser;

/************************************************************************************
 * 功能描述：导入用户时的实体类
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月15日 --  下午3:12 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class ProdUserVo extends ProdProductUser {

    private String email;

    private String mobilePhone;

    private String realName;

    private String identityCardNo;

    private String regionCode;

    private String industryCode;

    private String customerId;

    private Integer type;

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdentityCardNo() {
        return this.identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getIndustryCode() {
        return this.industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getMobilePhone() {
        return mobilePhone;
    }

    @Override
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
