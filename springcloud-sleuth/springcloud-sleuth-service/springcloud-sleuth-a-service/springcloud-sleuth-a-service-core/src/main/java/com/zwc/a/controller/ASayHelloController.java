package com.zwc.a.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @ClassName ASayHelloController
 * @Desc TODO   Say Hello
 * @Date 2019/5/20 23:24
 * @Version 1.0
 */
@RestController
public class ASayHelloController {

    /*
     * @ClassName ASayHelloController
     * @Desc TODO   读取配置文件中的端口
     * @Date 2019/5/20 23:24
     * @Version 1.0
     */
    @Value("${server.port}")
    private String port;

    /*
     * @ClassName ASayHelloController
     * @Desc TODO   Say Hello
     * @Date 2019/5/20 23:24
     * @Version 1.0
     */
    @RequestMapping("/a")
    public String a(){
        return "Hello！I'm a. port：" + port;
    }

}
