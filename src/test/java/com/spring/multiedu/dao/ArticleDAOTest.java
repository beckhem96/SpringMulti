package com.spring.multiedu.dao;

import com.spring.multiedu.vo.ArticleVO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ArticleDAOTest {
    @Test
    public void testSelectArticleById() {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("file:src/main/webapp/WEB-INF/*.xml");
        ArticleDAO dao = ctx.getBean("articleDAO", ArticleDAO.class);
        ArticleVO vo= dao.selectArticleById(null);

        Assert.assertEquals("lee", vo.getArticleAuthor());
    }
}
