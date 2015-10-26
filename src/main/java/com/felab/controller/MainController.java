package com.felab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/10/26 0026.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
        return "common";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
        return "admin";
    }
}
