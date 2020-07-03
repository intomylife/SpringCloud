package com.zwc.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Desc TODO   读取远程配置信息
 * @Date 2020/7/2 6:19 PM
 * @Version 1.0
 */
@RestController
@RefreshScope
public class UserController {

    @Value("${user.data.info}")
    String dataInfo;

    @Value("${user.group}")
    String group;

    @Value("${user.ext.name}")
    String extName;

    /*
      * @ClassName UserController
      * @Desc TODO  读取远程配置信息
      * @Date 2020/7/2 6:19 PM
      * @Version 1.0
     */
    @GetMapping(value = "/info")
    public String info() {
        return "dataInfo: " + dataInfo + ", group: " + group + ", extName: " + extName;
    }

}
