package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudHystrixRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixRegistryServiceApplication.class, args);
    }

}
