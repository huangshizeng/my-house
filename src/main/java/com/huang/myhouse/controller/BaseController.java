package com.huang.myhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hsz
 */

@Controller
public class BaseController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "黄世增");
        return "hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
