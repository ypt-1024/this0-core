package com.this0.blog.mapper;

import com.this0.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> selectAllArticleByCategory(Article article);

    Article selectArticleById(Integer id);

    List<Article> selectAllArticleByUid(Long uid);
}