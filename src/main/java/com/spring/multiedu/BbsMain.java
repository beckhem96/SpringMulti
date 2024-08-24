package com.spring.multiedu;

import com.spring.multiedu.dao.BbsDAO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BbsMain {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
        BbsDAO dao = ctx.getBean("bbsDAO", BbsDAO.class);
        int result = dao.addTwoNumber(1, 2);
        System.out.println(result);
    }
}
