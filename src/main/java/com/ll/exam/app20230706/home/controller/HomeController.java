package com.ll.exam.app20230706.home.controller;

import com.ll.exam.app20230706.article.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String showMain() {
        return "<h1>Hello, SB</h1>";
    }
}
