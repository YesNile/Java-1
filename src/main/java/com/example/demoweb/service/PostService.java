package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        return posts;
    }

    {
        posts.add(new Post(1L,"202", new Date()));
        posts.add(new Post(2L,"101", new Date()));
        posts.add(new Post(3L,"tetet",new Date()));
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
