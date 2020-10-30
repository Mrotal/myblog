package com.hacker9527.myblog.service;

import com.hacker9527.myblog.entity.Article;

import java.util.List;

/**
 * @author Mrotal
 * @create 2020-10-28-23:45
 */
public interface ArticleService {

    List<Article> findAll();

    Article findById(int id);

    void update(Article article);
}
