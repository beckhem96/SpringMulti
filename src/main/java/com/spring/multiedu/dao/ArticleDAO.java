package com.spring.multiedu.dao;

import com.spring.multiedu.vo.ArticleVO;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {
    public void insertArticle(ArticleVO vo) {
        System.out.println(vo);
    }
}
