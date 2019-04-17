package com.huang.myhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hsz
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/center")
    public String center() {
        return "admin/center";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "admin/welcome";
    }

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "admin/login";
    }
}
