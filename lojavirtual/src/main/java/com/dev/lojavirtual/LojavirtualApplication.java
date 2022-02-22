package com.dev.lojavirtual;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojavirtualApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LojavirtualApplication.class, args);
		SpringApplication app = new SpringApplication(LojavirtualApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
		app.run(args);
	}

}
