package com.softplan.apigerenciarprocessos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableAutoConfiguration
public class ApiGerenciarProcessosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGerenciarProcessosApplication.class, args);
	}

}
