package com.superstar.sprcld.svc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by alexlu on 2018/7/10.
 */
@SpringBootApplication(scanBasePackages = "com.superstar.sprcld.svc2")
@EnableDiscoveryClient
@EnableFeignClients
//@RestController
public class Service2Application {
//    @GetMapping("/service2")
//    public String service2(){
//        return "Test srv 2";
//    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
