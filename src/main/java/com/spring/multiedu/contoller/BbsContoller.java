package com.spring.multiedu.contoller;

import com.spring.multiedu.service.BbsService;
import com.spring.multiedu.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bbs")
public class BbsContoller {
    @Autowired
    private BbsService bbsService;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/{articleId}")
    @ResponseBody
    public ArticleVO viewDetail(@PathVariable("articleId") String articleId){
        return this.bbsService.viewArticleDetail(articleId);
    }
    @PostMapping("/write")
    @ResponseBody
    public void writeArticle(@RequestBody ArticleVO articleVo) {
        System.out.println("ssss");
        this.bbsService.registerArticle(articleVo);
    }
//    @GetMapping("/{articleId}")
//    public String viewDetail(@PathVariable String articleId) {
//        System.out.println(articleId);
//        return "write_ok";
//    }

//    @GetMapping("/write")
//    public String write(@RequestParam("author") String author) {
//        bbsService.registerArticle(new ArticleVO());
//        System.out.println("get");
//        return "write_ok";
//    }
//    @PostMapping("/write")
//    public ModelAndView doWrite(ArticleVO articleVO) {
//        bbsService.registerArticle(articleVO);
//        System.out.println("post");
//        return new ModelAndView("write_ok").addObject("article", articleVO);
//    }
}
