package com.zwc.b.api.feign;

import com.zwc.b.api.impl.FeignApiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @ClassName FeignApi
 * @Desc TODO   使用 Feign 调用 c - 接口
 * @Date 2019/5/20 23:10
 * @Version 1.0
 */
@FeignClient(value = "hystrix-c" , fallback = FeignApiFallBack.class)
public interface FeignApi {

    /*
     * @ClassName FeignApi
     * @Desc TODO   通过 hystrix-c 服务名调用 c() 方法
     * @Date 2019/5/20 23:10
     * @Version 1.0
     */
    @RequestMapping("/c")
    String c();

}
