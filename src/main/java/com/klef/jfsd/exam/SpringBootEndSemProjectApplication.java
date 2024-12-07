package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootEndSemProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEndSemProjectApplication.class, args);
		System.out.println("Rest template is running...");
	}
	
	@Bean
    public RestTemplate restTemplate()
  {
    return new RestTemplate();
  }

}
