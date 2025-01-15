package com.this0.blog.controller;

import com.this0.blog.entity.Category;
import com.this0.blog.service.CategoryService;
import com.this0.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/category")
@RestController
@CrossOrigin
@Tag(name = "文章分类模块")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "查询所有文章分类")
    @GetMapping("/showAll")
    public Result<List<Category>> showAll() {
        List<Category> categoryList = categoryService.findAllCategory();
        return Result.ok(categoryList);
    }

}
