package com.this0.blog.service.impl;

import com.this0.blog.entity.Category;
import com.this0.blog.mapper.CategoryMapper;
import com.this0.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Category> findAllCategory() {
        return categoryMapper.selectAllCategory();
    }

    @Override
    public Integer updataCategory(Category category) {
        return categoryMapper.updateCategory(category);
    }

    @Override
    public Integer addCategory(Category category) {
        return categoryMapper.insertCategory(category);
    }

    @Override
    public Integer deleteCategory(Integer cid) {
        return categoryMapper.deleteCategory(cid);
    }

}
