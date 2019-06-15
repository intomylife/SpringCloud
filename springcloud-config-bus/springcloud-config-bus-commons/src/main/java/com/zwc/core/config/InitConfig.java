package com.zwc.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * @ClassName InitConfig
 * @Desc TODO   加载配置文件
 * @Date 2019/6/15 12:58
 * @Version 1.0
 */
@Configuration
@PropertySource("classpath:system.properties")
public class InitConfig {


}