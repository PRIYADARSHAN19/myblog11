package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.payload.postDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public postDto craetePost(postDto postDto) {
       Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
         Post savedpost=postRepository.save(post);

         postDto dto=new postDto();
         dto.setTitle(savedpost.getTitle());
         dto.setDescription(savedpost.getDescription());
         dto.setContent(savedpost.getContent());

         return dto;
    }
}
