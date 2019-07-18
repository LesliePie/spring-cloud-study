package com.study.cloud.consumer2.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springCloud
 * @description: 回调方法
 * @author: Leslie
 * @create: 2019-07-18 10:28
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name + "for hystrix";
    }
}
