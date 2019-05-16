package com.zwc.consumer.controller;

import com.zwc.consumer.api.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FeignController
 * @Desc TODO   使用 Feign 调用 Api - 前端控制器
 * @Date 2019/5/15 16:18
 * @Version 1.0
 */
@RestController
public class FeignController {

    @Autowired(required = false)
    private FeignApi feignApi;

    /*
     * @ClassName FeignController
     * @Desc TODO   调用 Say Hello 方法
     * @Date 2019/5/15 16:20
     * @Version 1.0
     */
    @RequestMapping("/feign")
    public String feign(){
        return feignApi.hello();
    }

}
