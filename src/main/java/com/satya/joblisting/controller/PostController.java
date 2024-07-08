package com.satya.joblisting.controller;

import com.satya.joblisting.model.Post;
import com.satya.joblisting.repository.Repo;
import com.satya.joblisting.repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    Repo repo;

    @Autowired
    SearchRepo srepo;


    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {

        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allPost")
    public List<Post> getAll(){


        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return repo.save(post);
    }


    @GetMapping("/post/{text}")
    public List<Post> search(@PathVariable String text){


        return srepo.findByText(text);
    }
}
