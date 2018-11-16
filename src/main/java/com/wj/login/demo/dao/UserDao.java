/**
 * Copyright (C), 2017-2018, 追梦者有限公司
 * FileName: UserDao
 * Author:   asus
 * Date:     2018-11-14 20:58
 * Description: 用户的持久层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名         修改时间           版本号            描述
 */
package com.wj.login.demo.dao;

import com.wj.login.demo.entity.User;

/**
 * 〈用户的持久层〉
 *
 * @author asus
 * @create 2018-11-14
 * @since 1.0.0
 */
public interface UserDao {
    public User login(String loginId, String loginPwd);
}
