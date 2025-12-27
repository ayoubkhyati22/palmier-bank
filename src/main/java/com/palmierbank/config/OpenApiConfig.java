package com.palmierbank.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "PALMIER BANK API",
                version = "1.0",
                description = "API for managing clients and accounts"
        )
)
public class OpenApiConfig {
}

