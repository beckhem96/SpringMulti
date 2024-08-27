package com.spring.multiedu;

import com.spring.multiedu.service.BbsService;
import com.spring.multiedu.vo.ArticleVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BbsMain {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
        BbsService service = ctx.getBean("bbsService", BbsService.class);
//        System.out.println(result);
    }
}
