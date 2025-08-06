package com.friendbook.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploads/images/**")
				.addResourceLocations("file:uploads/images/");
		registry.addResourceHandler("/uploads/posts/**")
				.addResourceLocations("file:uploads/posts/");
	}
	
}
