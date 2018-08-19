package com.hsbc.tt.springboot.service.api;

import com.hsbc.tt.springboot.pojo.entity.User;

/**
 * Cteate by IntelliJ IDEA
 * Author:  Damon Chen
 * Date:  2018/8/19 11:42
 */
public interface UserService {

    /**
     *  add new user
     * @param user
     */
    void save(User user);

    /**
     *   find user by username
     * @param username
     * @return
     */
    User findByUsername(String username);

}
