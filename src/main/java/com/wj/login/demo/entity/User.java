/**
 * Copyright (C), 2017-2018, 追梦者有限公司
 * FileName: User
 * Author:   asus
 * Date:     2018-11-14 20:51
 * Description: 用户实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名         修改时间           版本号            描述
 */
package com.wj.login.demo.entity;

/**
 * 〈用户实体类〉
 *
 * @author asus
 * @create 2018-11-14
 * @since 1.0.0
 */
public class User {
    private String loginId;
    private String loginPwd;
    private String userName;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
