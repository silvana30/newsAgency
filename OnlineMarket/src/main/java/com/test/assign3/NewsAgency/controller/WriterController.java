package com.test.assign3.NewsAgency.controller;


import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.model.RelatedArticles;
import com.test.assign3.NewsAgency.services.ArticleService;
import com.test.assign3.NewsAgency.services.RelatedArticlesService;
import com.test.assign3.NewsAgency.services.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Controller
public class WriterController implements Observer{


    @Autowired
    private ArticleService articleService;

    @Autowired
    private RelatedArticlesService relatedArticlesService;


    @RequestMapping(value = "/writerPage/addArticle", method = RequestMethod.GET)
    public String goToAddArticle() {

        return "addArticle";
    }

    @RequestMapping(value = "/writerPage/update", method = RequestMethod.GET)
    public String goToUpdate() {
        return "update";
    }



    @RequestMapping(value = "/writerPage/delete", method = RequestMethod.GET)
    public String goToDelete() {
        return "delete";
    }

    /*@RequestMapping(value = "/writerPage/viewArticles", method = RequestMethod.GET)
    public String goToView() {
        return "viewArticles";
    }
*/
    @RequestMapping(value = "/writerPage/logOut", method = RequestMethod.GET)
    public String goToLogOut() {
        return "redirect:/read";
    }

    @RequestMapping(value = "/writerPage/addArticle/add", method = RequestMethod.POST)
    public String addArticle(@RequestParam String title, @RequestParam String author, @RequestParam String abstractA, @RequestParam String body,@RequestParam int related) {
        Article article=articleService.addArticle(title, author, abstractA, body);
        Article relatedArt=articleService.findById(related);
        relatedArticlesService.addRelatedArt(article,relatedArt);
        return "redirect:/writerPage/addArticle";
    }

    @RequestMapping(value = "/writerPage/update/update", method = RequestMethod.POST)
    public String updateArticle(@RequestParam int id, @RequestParam String title, @RequestParam String author, @RequestParam String abstractA, @RequestParam String body) {
        articleService.update(id, title, author, abstractA, body);
        return "redirect:/writerPage/update";
    }

    @RequestMapping(value = "/writerPage/delete/delete", method = RequestMethod.POST)
    public String deleteArticle(@RequestParam int id) {
        articleService.delete(id);
        return "redirect:/writerPage/delete";
    }

    @RequestMapping(value = "/writerPage/viewArticles", method = RequestMethod.GET)
    public String viewArticle(Model model) {

        List<Article> articles1=new ArrayList<>();
        for(Article a:articleService.getAllArticles()){
            articles1.add(a);
        }
        model.addAttribute("articles1",articles1);

        return "viewArticles";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println((String)arg);

    }
}
