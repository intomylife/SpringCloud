package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudSleuthBServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSleuthBServiceCoreApplication.class, args);
    }

}
