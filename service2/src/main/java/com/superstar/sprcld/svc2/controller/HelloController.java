package com.superstar.sprcld.svc2.controller;

import com.superstar.sprcld.svc2.client.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexlu on 2018/7/11.
 */
public class HelloController {
    @Autowired
    private HelloServiceClient helloServiceClient;

    @RequestMapping("/hello/{errorId}")
    public String hello(@PathVariable("errorId") String errorId) {
        String result = helloServiceClient.hello(errorId);
        return "Invoke svc1 result is:" + result;
    }
}
