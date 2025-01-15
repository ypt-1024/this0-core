package com.this0.blog.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "文章分类实体")
public class Category {

    @Schema(description = "分类id")
    private Long cid;

    @Schema(description = "分类名称")
    private String cname; //分类名称
    private Date createTime;
    private Date updateTime;

}