package com.deeptruth.deeptruth.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DeepTruth API")
                        .description("DeepTruth 프로젝트의 API 문서입니다.")
                        .version("1.0"));
    }
}
