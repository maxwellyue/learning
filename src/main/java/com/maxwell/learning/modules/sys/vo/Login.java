package com.maxwell.learning.modules.sys.vo;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年03月15日 --  17:31 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Login {
    private String loginAccount;//用户名
    private String password;//用户密码
    private int type;//用户类型：0--表示公司内部员工，1表示其他

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
