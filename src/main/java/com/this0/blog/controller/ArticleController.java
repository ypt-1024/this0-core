package com.this0.blog.controller;

import com.this0.blog.entity.Article;
import com.this0.blog.service.ArticleService;
import com.this0.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/article")
@RestController
@CrossOrigin
@Tag(name = "文章模块")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/showAllByUid/{uid}")
    @Operation(summary = "根据uid查询文章列表")
    public Result showAllByUid(@PathVariable Long uid) {
        List<Article> list = articleService.showAllArticleByUid(uid);
        return Result.ok(list);
    }

    @PostMapping("/showAll")
    @Operation(summary = "根据分类查询文章")
    public Result showAll(@RequestBody Article article) {
        List<Article> articleList = articleService.showAllArticleByCategory(article);
        return Result.ok(articleList);

    }

    @GetMapping("/{id}")
    @Operation(summary = "根据文章id查询文章详情")
    public Result selectArticleById(@PathVariable("id") Integer id) {
        Article article = articleService.findArticleById(id);
        return Result.ok(article);

    }

}
