package com.felab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by azheng on 10/22/2015.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }
}
