package com.test.assign3.NewsAgency.controller;


import com.test.assign3.NewsAgency.services.RelatedArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelatedArticlesController {
    @Autowired
    private RelatedArticlesService relatedArticlesService;
}
