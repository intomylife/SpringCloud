package com.zwc.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Desc TODO   读取远程配置信息
 * @Date 2020/7/2 6:14 PM
 * @Version 1.0
 */
@RestController
@RefreshScope
public class OrderController {

    @Value("${order.data.info}")
    String dataInfo;

    @Value("${order.group}")
    String group;

    @Value("${order.ext.name}")
    String extName;

    /*
      * @ClassName OrderController
      * @Desc TODO  读取远程配置信息
      * @Date 2020/7/2 6:16 PM
      * @Version 1.0
     */
    @GetMapping(value = "/info")
    public String info() {
        return "dataInfo: " + dataInfo + ", group: " + group + ", extName: " + extName;
    }

}
