package com.hacker9527.myblog.controller;

import com.github.pagehelper.PageHelper;
import com.hacker9527.myblog.common.Result;
import com.hacker9527.myblog.entity.Article;
import com.hacker9527.myblog.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2020-10-23 14:21:05
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Result detail(@PathVariable(value = "id") Integer id) {
        return Result.success(articleService.findById(id));
    }

    @GetMapping("list")
    public Result list(@RequestParam(defaultValue = "1") int pageNum) {
        return Result.success(PageHelper.startPage(pageNum,10).doSelectPageInfo(()->articleService.findAll()));
    }

    @GetMapping("edit")
    public Result edit(@RequestBody Article article) {
        articleService.update(article);
        return Result.success("修改成功！");
    }

}