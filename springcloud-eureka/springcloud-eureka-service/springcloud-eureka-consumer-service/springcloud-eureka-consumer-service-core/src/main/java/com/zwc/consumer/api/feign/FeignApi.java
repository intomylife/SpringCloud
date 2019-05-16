package com.zwc.consumer.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName FeignApi
 * @Desc TODO   使用 Feign 调用 Api - 接口
 * @Date 2019/5/15 16:11
 * @Version 1.0
 */
@FeignClient("say-hello")
public interface FeignApi {

    /*
     * @ClassName FeignApi
     * @Desc TODO   通过 say-hello 服务名调用 /hello 方法
     * @Date 2019/5/15 16:17
     * @Version 1.0
     */
    @RequestMapping("/hello")
    String hello();

}
