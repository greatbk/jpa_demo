package com.example.jpa.demo1.repository;

import com.example.jpa.demo1.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    List<Article> findByTitle(String title);

    List<Article> findDistinctByCategory(String category);

    List<Article> findByTitleAndCategory(String title, String category);
}
