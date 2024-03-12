package com.estsoft.blogjpa.service;

import com.estsoft.blogjpa.dto.AddArticleRequest;
import com.estsoft.blogjpa.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }
    public void save(AddArticleRequest request){
        blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
    public Article findById(Long id){
        blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found id" + id));
        return blogRepository ;
    }
}
