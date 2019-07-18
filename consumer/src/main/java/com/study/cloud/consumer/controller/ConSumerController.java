package com.study.cloud.consumer.controller;

import com.study.cloud.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @description:
 * @author: Leslie
 * @create: 2019-07-18 09:39
 **/
@RestController
public class ConSumerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/hello/{name}")
    public String index(@PathVariable(value = "name") String name){
        return helloRemote.hello(name);
    }

}
