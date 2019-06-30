package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayBServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayBServiceCoreApplication.class, args);
    }

}
