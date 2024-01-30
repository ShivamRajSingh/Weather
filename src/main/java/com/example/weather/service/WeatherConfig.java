package com.example.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherConfig {

    @Value("${rapidapi.host}")
    private String rapidApiHost;

    @Value("${rapidapi.key}")
    private String rapidApiKey;

    @Bean
    public HttpHeaders rapidApiHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", rapidApiHost);
        headers.set("X-RapidAPI-Key", rapidApiKey);
        return headers;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
