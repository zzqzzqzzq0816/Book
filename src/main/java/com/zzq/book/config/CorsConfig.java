package com.zzq.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zzq
 * @date 2021/5/20 10:49
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    static final String[] METHODS = new String[] { "GET", "POST", "PUT", "DELETE" };
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(METHODS).maxAge(3600);
    }
}
