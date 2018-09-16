package com.hsbc.tt.springboot.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
/**
 * user'a role bean
 *
 * @author Damon Chen
 * @date 2018/08/19
 */
@Data
@Entity
@Table(name = "role",schema = "springboot")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;
    @Column(unique = true)
    private String name;
    private Date createTime;
    private Date UpdateTime;

    public Role(){}

    public Role(String name){
        this.name = name;
    }
}
