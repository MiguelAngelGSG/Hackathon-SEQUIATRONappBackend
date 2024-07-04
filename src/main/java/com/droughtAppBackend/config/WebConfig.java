package com.droughtAppBackend.config;

@Configuration
public class WebConfig implements WebMvcConfig {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://github.com/castellanorn/Hackatoon_Sequia")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);
    }
}