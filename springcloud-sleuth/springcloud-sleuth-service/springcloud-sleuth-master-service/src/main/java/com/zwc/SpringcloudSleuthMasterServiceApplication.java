package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SpringcloudSleuthMasterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSleuthMasterServiceApplication.class, args);
    }

}
