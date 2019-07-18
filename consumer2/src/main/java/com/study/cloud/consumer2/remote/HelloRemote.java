package com.study.cloud.consumer2.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springCloud
 * @description: feign调用实现
 * @author: Leslie
 * @create: 2019-07-18 09:35
 **/
@FeignClient(name = "spring-cloud-produce2", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
