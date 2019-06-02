package com.zwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigGitServerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigGitServerServiceApplication.class, args);
    }

}
