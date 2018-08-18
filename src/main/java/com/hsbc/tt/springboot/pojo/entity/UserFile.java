package com.hsbc.tt.springboot.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Cteate by IntelliJ IDEA
 * Author: Damon Chen
 * Date: 2018/8/18 19:32
 */
@Entity
@Table(name = "userFile",schema = "springboot")
@Data
public class UserFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;
    private String filename;
    private String path;
    private Date createTime;
    private Integer uid;
}
