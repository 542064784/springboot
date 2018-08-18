package com.hsbc.tt.springboot.pojo.dtd;

import lombok.Data;

import java.util.Date;

/**
 * Cteate by IntelliJ IDEA
 * Author: Damon Chen
 * Date: 2018/8/18 19:34
 */
@Data
public class FileDTD {
    private Long fid;
    private String filename;
    private String path;
    private Date createTime;
    private Integer uid;
}
