package com.this0.blog.service;

import com.this0.blog.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> showAllArticleByCategory(Article article);

    Article findArticleById(Integer id);

    List<Article> showAllArticleByUid(Long uid);

}
