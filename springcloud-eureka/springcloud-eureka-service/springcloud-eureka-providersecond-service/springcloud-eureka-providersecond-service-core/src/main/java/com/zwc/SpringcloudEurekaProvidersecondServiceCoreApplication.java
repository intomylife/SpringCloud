package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaProvidersecondServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaProvidersecondServiceCoreApplication.class, args);
    }

}
