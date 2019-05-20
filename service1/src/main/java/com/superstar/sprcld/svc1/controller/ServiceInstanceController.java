package com.superstar.sprcld.svc1.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alexlu on 2018/7/11.
 */
@RestController
public class ServiceInstanceController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/svc-instance/{appName}")
    public List<ServiceInstance> getSvcInstanceByAppName(@PathVariable("appName") String appName){
        return this.discoveryClient.getInstances(appName);
    }

    @RequestMapping("/hello/{errorId}")
    @HystrixCommand(fallbackMethod="helloFallback")
    public String hello(@PathVariable("errorId") String errorId){
        if("1".equals(errorId)){
            throw new RuntimeException("Exp occur...");
        }
        return "hello";
    }

    public String helloFallback(String fallback){
        return "Fallback param is:" + fallback;
    }
}
