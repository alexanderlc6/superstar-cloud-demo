package com.superstar.sprcld.svc2.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexlu on 2018/7/11.
 */
@FeignClient("service1")
public interface HelloServiceClient {
    @RequestMapping("/hello/{errorId}")
    String hello(@PathVariable("errorId") String errorId);
}
