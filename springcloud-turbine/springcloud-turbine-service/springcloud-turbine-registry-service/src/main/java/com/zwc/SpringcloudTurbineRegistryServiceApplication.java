package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudTurbineRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTurbineRegistryServiceApplication.class, args);
    }

}
