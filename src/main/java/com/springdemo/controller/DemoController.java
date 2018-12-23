package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        try {
            System.out.println("Im here!" + Thread.currentThread().getName());
            Thread.sleep(100000009);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "demo";
    }
}