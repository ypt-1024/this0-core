package com.this0.blog.mapper;

import com.this0.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> selectAllCategory();

    Integer updateCategory(Category category);

    Integer insertCategory(Category category);

    Integer deleteCategory(Integer cid);
}
