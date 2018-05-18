package com.test.assign3.NewsAgency.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.model.RelatedArticles;
import com.test.assign3.NewsAgency.services.ArticleService;

import com.test.assign3.NewsAgency.services.RelatedArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReaderController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private RelatedArticlesService relatedArticlesService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String main(Model model) {
        List<Article> articles = new ArrayList<>();
        for (Article a : articleService.getAllArticles()) {
            articles.add(a);
        }
        model.addAttribute("articles", articles);
        ObjectMapper obj = new ObjectMapper();
        try {
            obj.writeValueAsString(articles);
            model.addAttribute("json", obj.writeValueAsString(articles));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "read";
    }

    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)

    public String seeArticle(Model model, @PathVariable("title") String title) {
        Article article = articleService.findByTitle(title);

        List<RelatedArticles> articlesRelated = new ArrayList<RelatedArticles>();
        articlesRelated = relatedArticlesService.findByIdArticle(article);


        List<Article> lista = new ArrayList<>();
        for (RelatedArticles a : articlesRelated) {

            lista.add(a.getIdArticleRelated());

        }


        for (Article a : lista) {
            System.out.println(a.toString());
        }


        model.addAttribute("article", article);
        //model.addAttribute("title",title);
        model.addAttribute("lista", lista);

        return "/articlePage";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String goToLog() {
        return "login";
    }

}
