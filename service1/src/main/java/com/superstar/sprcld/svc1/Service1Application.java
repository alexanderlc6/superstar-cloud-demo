package com.superstar.sprcld.svc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by alexlu on 2018/7/10.
 */
@SpringBootApplication(scanBasePackages = "com.superstar.sprcld.svc1")
@EnableDiscoveryClient
//@RestController
@EnableHystrix
public class Service1Application {
//    @GetMapping("/service1")
//    public String service1(){
//        return "Test srv 1";
//    }

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
}
