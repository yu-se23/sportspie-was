package com.example.sportspie.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(title = "SportPie WAS",
				description = "SportPie API 명세",
				version = "v1")
)
@Configuration
public class SwaggerConfig {
	@Bean
	public GroupedOpenApi OpenApi() {
		String[] paths = {"/**"};

		return GroupedOpenApi.builder()
				.group("SportPie API v1")
				.pathsToMatch(paths)
				.build();
	}
}
