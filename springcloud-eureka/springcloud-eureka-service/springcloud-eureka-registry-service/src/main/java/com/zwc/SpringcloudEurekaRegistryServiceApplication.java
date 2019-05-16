package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaRegistryServiceApplication.class, args);
    }

}
