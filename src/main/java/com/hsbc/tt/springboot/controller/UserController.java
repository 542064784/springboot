package com.hsbc.tt.springboot.controller;

import com.hsbc.tt.springboot.pojo.dtd.ResultDTD;
import com.hsbc.tt.springboot.pojo.entity.User;
import com.hsbc.tt.springboot.service.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cteate by IntelliJ IDEA
 * Author:  Damon Chen
 * Date:  2018/8/19 11:48
 */
@RestController
@Slf4j
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    /**
     *  add new user
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public ResultDTD addUser(@RequestBody User user){
        ResultDTD resultDTD = new ResultDTD();
        try {
            userService.save(user);
            resultDTD.setStatus("200");
            resultDTD.setMessage("注册用户成功。");
        }catch (Exception e){
            resultDTD.setStatus("500");
            resultDTD.setMessage(e.getMessage());
        }
        return resultDTD;
    }

}
