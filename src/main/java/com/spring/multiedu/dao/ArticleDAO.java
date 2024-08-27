package com.spring.multiedu.dao;

import com.spring.multiedu.vo.ArticleVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {

    @Autowired
    SqlSession sqlSession;

    public void insertArticle(ArticleVO vo) {

        sqlSession.insert("insertArticle", vo);
    }

    public ArticleVO selectArticleById(String articleId) {
        sqlSession.selectOne("selectArticleById", articleId);
        return null;
    }
}
