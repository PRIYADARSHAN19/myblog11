package com.myblog.myblog11.controller;

import com.myblog.myblog11.payload.postDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/posts")

public class PostController {
    private PostService postservice;

    public PostController(PostService postservice) {
        this.postservice = postservice;
    }
  @PostMapping
    public ResponseEntity<postDto>createPost(@RequestBody postDto postDto){
         postDto dto=postservice.craetePost(postDto);
         return  new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
