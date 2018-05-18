package com.test.assign3.NewsAgency.services;


import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;

@Service
public class ArticleService extends Observable {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article findById(int id) {
        return articleRepository.findById(id);
    }

    public Article addArticle(String title, String author, String abstractA, String body) {
        Article article = new Article(title, abstractA, author, body);
        articleRepository.save(article);
        return article;
    }

    public Article update(int id, String title, String author, String abstractA, String body) {
        Article article = articleRepository.findById(id);
        article.setTitle(title);
        article.setAuthor(author);
        article.setAbstractA(abstractA);
        article.setBody(body);
        articleRepository.save(article);
        this.notifyObservers("updated");
        return article;

    }

    public void delete(int id) {
        Article article = articleRepository.findById(id);
        articleRepository.delete(article);
    }

    public Article findByTitle(String title) {
        Article article = articleRepository.findArticleByTitle(title);
        return article;
    }
}
