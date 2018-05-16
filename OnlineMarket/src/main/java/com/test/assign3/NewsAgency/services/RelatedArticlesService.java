package com.test.assign3.NewsAgency.services;

import com.test.assign3.NewsAgency.model.Article;
import com.test.assign3.NewsAgency.model.RelatedArticles;
import com.test.assign3.NewsAgency.repositories.RelatedArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;

@Service
public class RelatedArticlesService extends Observable{

    @Autowired
    private RelatedArticlesRepository relatedArticlesRepository;

    public List<RelatedArticles> findByIdArticle(Article a){
        //return relatedArticlesRepository.findRelatedArticlesByIdArticle(id);
        return relatedArticlesRepository.findAllByIdArticle(a);
    }

    public List<RelatedArticles> findByIdRelated(int id){
        return relatedArticlesRepository.findRelatedArticlesByIdArticleRelated(id);
    }

    public RelatedArticles addRelatedArt(Article a, Article reference){

            RelatedArticles relatedArticles=new RelatedArticles(a,reference);
            relatedArticlesRepository.save(relatedArticles);
            return relatedArticles;

    }
}
