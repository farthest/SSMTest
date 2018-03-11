package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping(value="/test",produces="text/plain;charset=UTF-8")
    public String index() {
        System.out.println("fsdg");
        return "test";
    }

}
