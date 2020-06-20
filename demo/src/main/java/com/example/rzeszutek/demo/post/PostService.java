package com.example.rzeszutek.demo.post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private static ArrayList<Post> posts = new ArrayList<>();
    private static int idCounter = 0;

    static {
        posts.add(new Post(++idCounter,
                "title1",
                "lorem lorem lorem lorem",
                "http://osnews.pl/wp-content/uploads/2016/06/it-grafika.jpg"));
    }

    public List<Post> getAll(){
        return posts;
    }

    public Post get(int id){
        return posts.get(id-1);
    }
}
