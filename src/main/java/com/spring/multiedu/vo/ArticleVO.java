package com.spring.multiedu.vo;

public class ArticleVO {
    private String articleId;
    private String articleTitle;
    private String articleAuthor;
    private String articleContent;

    public ArticleVO() {

    }

    public String getArticleId() {
        return articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "ArticleVO{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public ArticleVO(String articleId, String articleTitle, String articleAuthor, String articleContent) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleContent = articleContent;
    }
}
