package com.medicalrepresentativeschedule;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class MedRepScheduleServiceApplication {
	
	public static void main(String[] args) {
	
		
		SpringApplication.run(MedRepScheduleServiceApplication.class, args);
	
	}
	
}
