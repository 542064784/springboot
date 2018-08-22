package com.hsbc.tt.springboot.controller;

import com.hsbc.tt.springboot.pojo.dto.ResultDTO;
import com.hsbc.tt.springboot.pojo.entity.User;
import com.hsbc.tt.springboot.service.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *  user controller
 * @author Damon Chen
 * @date 2018/8/19
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
    public ResultDTO addUser(@RequestBody User user){
        ResultDTO resultDTD = new ResultDTO();
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
