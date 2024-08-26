package com.spring.multiedu.contoller;

import com.spring.multiedu.service.BbsService;
import com.spring.multiedu.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bbs")
public class BbsContoller {
    @Autowired
    private BbsService bbsService;

    @RequestMapping("/write")
    public String write(@RequestParam("author") String author) {
        bbsService.registerArticle(new ArticleVO());
        System.out.println(author);
        return "write_ok";
    }
}
