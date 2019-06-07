package com.zwc.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Desc TODO   读取 git 配置文件
 * @Date 2019/6/2 16:54
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Value("${hello}")
    private String hello;

    /*
     * @ClassName HelloController
     * @Desc TODO   读取 git 配置文件
     * @Date 2019/6/2 16:56
     * @Version 1.0
     */
    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }

}
