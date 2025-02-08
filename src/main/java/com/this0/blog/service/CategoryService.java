package com.this0.blog.service;

import com.this0.blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllCategory();

    Integer updataCategory(Category category);

    Integer addCategory(Category category);

    Integer deleteCategory(Integer cid);
}
