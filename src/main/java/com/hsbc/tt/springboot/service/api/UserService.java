package com.hsbc.tt.springboot.service.api;

import com.hsbc.tt.springboot.pojo.entity.User;
/**
 * user service interface
 *
 * @author Damon Chen
 * @date 2018/08/19
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
