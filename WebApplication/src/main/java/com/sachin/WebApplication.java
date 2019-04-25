package com.sachin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sachin.feign.ClientApplicationProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.sachin")
public class WebApplication {
	
	@Autowired
	ClientApplicationProxy clientApplicationProxy;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}	
}
