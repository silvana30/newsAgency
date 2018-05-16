package com.test.assign3.NewsAgency.repositories;

import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.model.RelatedArticles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelatedArticlesRepository extends JpaRepository<RelatedArticles,Integer> {
    List<RelatedArticles> findRelatedArticlesByIdArticle(int id_article);
    List<RelatedArticles> findAllByIdArticle(Article a);
    List<RelatedArticles> findRelatedArticlesByIdArticleRelated(int id_related);


}
