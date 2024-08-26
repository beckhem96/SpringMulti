package com.spring.multiedu.service;

import com.spring.multiedu.dao.ArticleDAO;
import com.spring.multiedu.vo.ArticleVO;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
    private ArticleDAO articleDAO;

    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    public void  registerArticle(ArticleVO articleVO) {
        articleDAO.insertArticle(articleVO);
    }
}
