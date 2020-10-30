package com.hacker9527.myblog.service.impl;

import com.hacker9527.myblog.mapper.ArticleDao;
import com.hacker9527.myblog.entity.Article;
import com.hacker9527.myblog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mrotal
 * @create 2020-10-28-23:47
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleDao articleDao;

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }

    @Override
    public Article findById(int id) {
        return articleDao.selectByPrimaryKey(id);
    }

    @Override
    public void update(Article article) {
        articleDao.updateByPrimaryKeySelective(article);
    }
}
