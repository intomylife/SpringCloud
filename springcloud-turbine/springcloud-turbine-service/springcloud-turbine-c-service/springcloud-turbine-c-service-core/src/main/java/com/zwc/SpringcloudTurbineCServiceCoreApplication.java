package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudTurbineCServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTurbineCServiceCoreApplication.class, args);
    }

}
