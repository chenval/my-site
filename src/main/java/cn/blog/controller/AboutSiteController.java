package cn.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutSiteController {
    @GetMapping(value = "/aboutSite")
    public String blogIndex(){
        return "site/aboutSite";
    }
}

