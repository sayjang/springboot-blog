package me.sayjang.springbootblog.config.error.exception;

import me.sayjang.springbootblog.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException {
    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}