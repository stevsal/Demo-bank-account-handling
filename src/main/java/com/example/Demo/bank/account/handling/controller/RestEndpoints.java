package com.example.Demo.bank.account.handling.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoints {

    @RequestMapping("/test")
    public Test getEndpoint(@RequestParam(value="name", defaultValue = "spring boot", required = false) String name,
                            @RequestParam(value="chapterCount", defaultValue = "1", required = false) int chapterCount){
        return new Test(name, chapterCount);
    }
}
