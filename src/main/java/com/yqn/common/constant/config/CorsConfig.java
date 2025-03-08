package com.yqn.common.constant.config;
//允许所有来源的跨域请求，支持GET、POST、PUT、DELETE方法，允许请求中包含凭证，并且允许所有请求头和响应头。
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration//标注该类为 Spring 配置类，会在应用启动时自动加载。
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
}
