package com.example.jpa.demo1.service;

import com.example.jpa.demo1.entity.Article;

import java.util.List;

public interface IArticleService {

    List<Article> getAllArticles();

    Article getArticleById(long articleId);

    boolean addArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);
}
