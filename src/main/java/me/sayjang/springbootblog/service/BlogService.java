package me.sayjang.springbootblog.service;

import lombok.RequiredArgsConstructor;
import me.sayjang.springbootblog.domain.Article;
import me.sayjang.springbootblog.dto.AddArticleRequest;
import me.sayjang.springbootblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
