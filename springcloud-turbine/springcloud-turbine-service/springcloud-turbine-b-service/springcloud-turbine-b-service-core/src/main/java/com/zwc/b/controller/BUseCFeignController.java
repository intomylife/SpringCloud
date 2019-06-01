package com.zwc.b.controller;

import com.zwc.b.api.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @ClassName FeignController
 * @Desc TODO   使用 Feign 调用 c - 前端控制器
 * @Date 2019/5/20 23:13
 * @Version 1.0
 */
@RestController
public class BUseCFeignController {

    @Autowired(required = false)
    private FeignApi feignApi;

    /*
     * @ClassName FeignController
     * @Desc TODO   通过 hystrix-c 服务名调用 c() 方法
     * @Date 2019/5/20 23:13
     * @Version 1.0
     */
    @RequestMapping("/bUseC")
    public String bUseC(){
        return feignApi.c();
    }

}
