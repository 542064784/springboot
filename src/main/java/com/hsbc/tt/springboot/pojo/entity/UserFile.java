package com.hsbc.tt.springboot.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
/**
 * user file bean
 *
 * @author Damon Chen
 * @date 2018/08/19
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
