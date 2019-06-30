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
    @RequestMapping("/hello")
    public String hello(){
        return "Hello！I'm a. port：" + port;
    }

    /*
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/23 16:28
     * @Version 1.0
     */
    @RequestMapping("/name")
    public String name(String name){
        return "My name is " + name + ". aaa";
    }

    /*
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/23 16:52
     * @Version 1.0
     */
    @RequestMapping("/age")
    public String age(String age){
        return "I am " + age + " years old this year. aaa";
    }

    /*
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/29 22:00
     * @Version 1.0
     */
    @RequestMapping("/routeAll")
    public String routeAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }

}
