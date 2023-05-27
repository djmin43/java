package com.example.mindongjoon.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Worldx1";
    }

    @GetMapping("sbb")
    @ResponseBody
    public String index() {
        return "index";
    }
}
