package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryProviderFirstServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryProviderFirstServiceCoreApplication.class, args);
    }

}
