package com.test.assign3.NewsAgency.repositories;


import com.test.assign3.NewsAgency.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Observable;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Article findById(int id);
    Article findArticleByTitle(String title);
}
