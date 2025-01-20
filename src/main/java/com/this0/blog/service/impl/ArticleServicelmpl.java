package com.this0.blog.service.impl;

import com.this0.blog.entity.Article;
import com.this0.blog.mapper.ArticleMapper;
import com.this0.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServicelmpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Article> showAllArticleByCategory(Article article) {
        return articleMapper.selectAllArticleByCategory(article);
    }

    @Override
    @Transactional(readOnly = true)
    public Article findArticleById(Integer id) {
        return  articleMapper.selectArticleById(id);

    }
}
