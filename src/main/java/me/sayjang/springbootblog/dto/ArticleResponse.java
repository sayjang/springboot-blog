package me.sayjang.springbootblog.dto;

import lombok.Getter;
import me.sayjang.springbootblog.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
