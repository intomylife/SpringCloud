package com.zwc.first.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Desc TODO   读取 server 配置文件
 * @Date 2019/6/2 16:54
 * @Version 1.0
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${hello}")
    private String hello;

    /*
     * @ClassName HelloController
     * @Desc TODO   读取 server 配置文件
     * @Date 2019/6/2 16:56
     * @Version 1.0
     */
    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }

}
