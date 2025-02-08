package com.this0.blog.controller;

import com.this0.blog.entity.Category;
import com.this0.blog.service.CategoryService;
import com.this0.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @Operation(summary = "修改文章分类")
    @PutMapping
    public Result<Category> changeCategory(@RequestBody Category category) {
        Integer result = categoryService.updataCategory(category);
        if (result == 1) {
            return Result.ok();
        }
        return Result.fail();
    }

    @Operation(summary = "新增文章分类")
    @PostMapping
    public Result<Category> addCategory(@RequestBody Category category) {
        Integer result = categoryService.addCategory(category);
        if (result == 1) {
            return Result.ok();
        }
        return Result.fail();
    }

    @Operation(summary = "删除分类")
    @DeleteMapping("/{cid}")
    public Result<Category> removeCategory(@PathVariable Integer cid) {
        Integer result = categoryService.deleteCategory(cid);
        if (result == 1) {
            return Result.ok();
        }
        return Result.fail();
    }

}
