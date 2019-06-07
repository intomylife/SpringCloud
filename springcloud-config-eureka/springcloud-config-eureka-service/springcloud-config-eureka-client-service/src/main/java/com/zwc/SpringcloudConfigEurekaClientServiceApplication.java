package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConfigEurekaClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigEurekaClientServiceApplication.class, args);
    }

}
