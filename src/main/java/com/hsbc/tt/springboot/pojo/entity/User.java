package com.hsbc.tt.springboot.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Cteate by IntelliJ IDEA
 * Author: Damon Chen
 * Date: 2018/8/18 19:30
 */
@Entity
@Table(name = "user",schema = "springboot")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
}
