package com.zwc.a.controller;

import com.zwc.a.api.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @ClassName AUseBFeignController
 * @Desc TODO   使用 Feign 调用 b - 前端控制器
 * @Date 2019/5/20 23:23
 * @Version 1.0
 */
@RestController
public class AUseBFeignController {

    @Autowired(required = false)
    private FeignApi feignApi;

    /*
     * @ClassName FeignController
     * @Desc TODO   通过 turbine-b 服务名调用 b() 方法
     * @Date 2019/5/20 23:13
     * @Version 1.0
     */
    @RequestMapping("/aUseB")
    public String aUseB(){
        return feignApi.b();
    }

}
