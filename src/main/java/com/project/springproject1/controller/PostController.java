package com.project.springproject1.controller;

import com.project.springproject1.domain.Post;
import com.project.springproject1.domain.PostRepository;
import com.project.springproject1.domain.PostRequestDto;
import com.project.springproject1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @GetMapping("/api/post")
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    @PostMapping("/api/post/password/{id}")
    public boolean checkPassword(@PathVariable Long id, @RequestBody PostRequestDto requestDto) throws Exception {
        return postService.checkPassword(id, requestDto.getPassword());
    }

    @PutMapping("/api/post/{id}")
    public boolean updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) throws Exception {
        if(postService.checkPassword(id, requestDto.getPassword())){
            postService.update(id, requestDto);
            return true;
        }
            return false;
    }


    @DeleteMapping("/api/post/{id}")
    public boolean deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) throws Exception {
        if(postService.checkPassword(id, requestDto.getPassword())){
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }

}