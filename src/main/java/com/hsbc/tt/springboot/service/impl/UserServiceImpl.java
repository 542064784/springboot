package com.hsbc.tt.springboot.service.impl;

import com.hsbc.tt.springboot.repository.UserRepository;
import com.hsbc.tt.springboot.pojo.entity.User;
import com.hsbc.tt.springboot.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * user service impl
 *
 * @author  Damon Chen
 * @date 2018/08/19
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     * add new user
     *
     * @param user  new user
     */
    @Override
    public void save(User user) {
        User findUser = findByUsername(user.getUsername());
        if (findUser != null){
         throw new RuntimeException("用户名已存在，请重新输入！！！");
        }
        userRepository.save(user);
    }

    /**
     * find user by username
     *
     * @param username
     * @return
     */
    @Override
    public User findByUsername(String username){
        User user = userRepository.findByUsername(username);
        return user;
    }

}
