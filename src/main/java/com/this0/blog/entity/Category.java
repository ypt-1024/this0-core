package com.this0.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Long cid;
    private String cname; //分类名称
    private Date createTime;
    private Date updateTime;

}