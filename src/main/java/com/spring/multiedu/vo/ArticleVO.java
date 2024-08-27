package com.spring.multiedu.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleVO {
    private String articleId;
    private String title;
    private String author;
    private String content;

    public ArticleVO() {
    }

    public ArticleVO(String articleId, String title, String author, String content) {
        this.articleId = articleId;
        this.title = title;
        this.author = author;
        this.content = content;
    }
}
