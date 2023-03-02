package com.test.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/testPage")
    public String testPage(){

        return "testPage.html";
    }
}
