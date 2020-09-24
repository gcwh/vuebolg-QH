package com.qh.blogservice.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"com.qh"})
@RequestMapping("/test")
public class TestController {
    @ApiOperation("测试")
    @GetMapping
    public String test(){
        return "test";
    }
}
