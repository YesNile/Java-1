package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private final String text;

    private Long id;

    private int likes;

    private Date creationDate;

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(Long id,String text,Date creationDate) {
        this.text = text;
        this.id = id;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
