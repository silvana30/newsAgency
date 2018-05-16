package com.test.assign3.NewsAgency.model;

import javax.persistence.*;

@Entity
@Table(name = "related_articles")
public class RelatedArticles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_article", nullable = false)
    private Article idArticle;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_related", nullable = false)
    private Article idArticleRelated;

    public RelatedArticles() {
    }

    public RelatedArticles(Article idArticle, Article idArticleRelated) {
        this.idArticle = idArticle;
        this.idArticleRelated = idArticleRelated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Article idArticle) {
        this.idArticle = idArticle;
    }

    public Article getIdArticleRelated() {
        return idArticleRelated;
    }

    public void setIdArticleRelated(Article idArticleRelated) {
        this.idArticleRelated = idArticleRelated;
    }
}
