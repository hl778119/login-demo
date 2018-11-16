/**
 * Copyright (C), 2017-2018, 追梦者有限公司
 * FileName: UserDaoImpl
 * Author:   asus
 * Date:     2018-11-14 20:58
 * Description: UserDao的实现层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名         修改时间           版本号            描述
 */
package com.wj.login.demo.dao.impl;

import com.wj.login.demo.dao.UserDao;
import com.wj.login.demo.entity.User;

/**
 * 〈UserDao的实现层〉
 *
 * @author asus
 * @create 2018-11-14
 * @since 1.0.0
 */
public class UserDaoImpl implements UserDao {

    public User login(String loginId, String loginPwd) {
        User user = null;
        // 直接根据 LoginId 查询这个用户信息
        if ("admin".equals(loginId)) {
            // 再根据传入的密码匹配
            if ("admin".equals(loginPwd)) {
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                user.setUserName("Wise");
            }
        }
        return user;
    }
}
