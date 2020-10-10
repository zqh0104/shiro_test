package com.qihang.shiro_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @Author: QiHangZhang
 * @Date: 2020/9/7 10:34
 * @Description: 该类配置Shiro未授权跳转
 */
@Configuration
public class ExceptionConfig {

    @Bean
    public SimpleMappingExceptionResolver resolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        properties.setProperty("AuthorizationException", "/403");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}
