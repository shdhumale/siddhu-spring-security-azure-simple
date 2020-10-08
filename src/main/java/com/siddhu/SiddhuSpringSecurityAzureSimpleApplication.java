package com.siddhu;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiddhuSpringSecurityAzureSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiddhuSpringSecurityAzureSimpleApplication.class, args);		
		/*SpringApplication app = new SpringApplication(SiddhuSpringSecurityAzureSimpleApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
        app.run(args);*/
	}

}
