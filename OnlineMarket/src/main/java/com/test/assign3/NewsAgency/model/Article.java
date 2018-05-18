package com.test.assign3.NewsAgency.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "abstractA")
    private String abstractA;

    @Column(name = "author")
    private String author;

    @Column(name = "body")
    private String body;

    //private List<Article> relatedArt;

    public Article() {
    }

    public Article(String title, String abstractA, String author, String body) {
        this.title = title;
        this.abstractA = abstractA;
        this.author = author;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractA() {
        return abstractA;
    }

    public void setAbstractA(String abstractA) {
        this.abstractA = abstractA;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", abstractA='" + abstractA + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
