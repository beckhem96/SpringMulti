package com.spring.multiedu.service;

import com.spring.multiedu.dao.ArticleDAO;
import com.spring.multiedu.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

    @Autowired // 자동 DI
    private ArticleDAO articleDAO;

    public void  registerArticle(ArticleVO articleVO) {
        articleDAO.insertArticle(articleVO);
    }

    public ArticleVO viewArticleDetail(String articleId) {
        return new ArticleVO(articleId, "lee", "test", "testim");
    }
}
