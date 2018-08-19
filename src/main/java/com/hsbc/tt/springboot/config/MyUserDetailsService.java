package com.hsbc.tt.springboot.config;

import com.hsbc.tt.springboot.Repository.UserRepository;
import com.hsbc.tt.springboot.pojo.entity.AuthUser;
import com.hsbc.tt.springboot.pojo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Cteate by IntelliJ IDEA
 * Author:  Damon Chen
 * Date:  2018/8/19 10:32
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public MyUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser = new AuthUser();
        User user = userRepository.findByUsername(username);
        BeanUtils.copyProperties(user,authUser);
        return authUser;
    }
}
