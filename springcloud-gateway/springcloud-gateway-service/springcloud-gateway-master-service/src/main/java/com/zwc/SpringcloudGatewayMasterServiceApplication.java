package com.zwc;

import com.zwc.gateway.config.filters.TokenFilter;
import com.zwc.gateway.config.filters.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayMasterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayMasterServiceApplication.class, args);
    }

    /*
     * @ClassName SpringcloudGatewayMasterServiceApplication
     * @Desc TODO   配置限流 Bean
     * @Date 2019/6/29 17:12
     * @Version 1.0
     */
    @Bean(name = "uriKeyResolver")
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }

    /*
     * @ClassName SpringcloudGatewayMasterServiceApplication
     * @Desc TODO   配置认证过滤器 Bean
     * @Date 2019/6/29 17:58
     * @Version 1.0
     */
    @Bean(name = "tokenFilter")
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

}
