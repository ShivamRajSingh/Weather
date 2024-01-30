package com.example.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String baseUrl = "https://forecast9.p.rapidapi.com/";

    @Autowired
    private HttpHeaders rapidApiHeaders;

    @Autowired
    private RestTemplate restTemplate;

    public String getForecastSummary(String city) {
        String url = baseUrl + "rapidapi/forecast/" + city + "/summary/";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(rapidApiHeaders), String.class);
        return response.getBody();
    }

    public String getHourlyForecast(String city) {
        String url = baseUrl + "rapidapi/forecast/" + city + "/hourly/";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(rapidApiHeaders), String.class);
        return response.getBody();
    }
}

