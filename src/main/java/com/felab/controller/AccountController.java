package com.felab.controller;

import com.felab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by azheng on 10/28/2015.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public String changePassword(@RequestParam("password") String newPassword) {
//        userService.changePassword();
        return null;
    }
}
