package com.hsbc.tt.springboot.pojo.dto;

import lombok.Data;

import java.util.Date;
/**
 * return user's file DTO
 *
 * @author Damon Chen
 * @date 2018/08/19
 */
@Data
public class FileDTO {
    private Long fid;
    private String filename;
    private String path;
    private Date createTime;
    private Integer uid;
}
