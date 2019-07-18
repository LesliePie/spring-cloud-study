package com.study.cloud.clientconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @description:
 * @author: Leslie
 * @create: 2019-07-18 16:44
 **/
@RestController
public class HelloController {
    @Value("${test.hello}")
    private String hello;

    @GetMapping(value = "/hello")
    public String from(){
        return this.hello;
    }
}
