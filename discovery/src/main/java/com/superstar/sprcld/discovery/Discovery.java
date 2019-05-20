package com.superstar.sprcld.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by alexlu on 2018/7/10.
 */
@SpringBootApplication
@EnableEurekaServer
public class Discovery {
    public static void main(String[] args) {
        SpringApplication.run(Discovery.class, args);
    }
}
