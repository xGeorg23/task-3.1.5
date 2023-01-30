package com.example.task315.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.example.task315")
public class CookieConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
