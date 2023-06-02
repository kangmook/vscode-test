package com.skmns.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    public OpenAPI openApi() {
        Info info = new Info() 
                .version("Version 1.0")
                .title("Sungmook API")
                .description("성묵의 개인 API 입니다");
        
        return new OpenAPI()
            .info(info);
    }
}
