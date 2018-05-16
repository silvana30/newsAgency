package com.test.assign3.NewsAgency.controller;


import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAllArticles(){
        return articleService.getAllArticles();
    }
}
