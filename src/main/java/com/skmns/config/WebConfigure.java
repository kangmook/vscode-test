package com.skmns.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.skmns.common.interceptor.HttpInterceptor;

@Configuration
public class WebConfigure implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HttpInterceptor()).excludePathPatterns("/static/**", "/api/**", "/swagger-ui/**", "/v3/**");
    }
}
