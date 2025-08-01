package com.lucas_costa.course;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI(){

        return new OpenAPI().info(new Info()
                .title("API de pedidos")
                .version("1.0.0")
                .description("API feita com base no curso DevSuperior.")
        );
    }
}
