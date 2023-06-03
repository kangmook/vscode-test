package com.skmns.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Sungmook API",
        description = "성묵의 개인 API 입니다.",
        version = "v1",
        contact = @Contact(
            name = "kang sung mook",
            email = "kangmook@gmail.com"
        )
    )
)
@Configuration
public class SwaggerConfig {
       
}
