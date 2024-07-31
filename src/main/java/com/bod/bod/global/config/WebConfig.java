//package com.bod.bod.global.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.CacheControl;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//	registry.addMapping("/**")
//		.allowedOrigins("http://localhost:8081")
//		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//		.allowCredentials(true)
//		.maxAge(3600);
//  }
//
//
//  @Override
//  public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	registry.addResourceHandler("/**")
//		.addResourceLocations("classpath:/META-INF/resources/")
//		.setCacheControl(CacheControl.noStore())
//		.setCachePeriod(0);
//  }
//}