package com.upb.projecttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectTwoApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(ProjectTwoApplication.class, args);
		String port = app.getEnvironment().getProperty("local.server.port");
		System.out.println("La aplicación se está ejecutando en http://localhost:" + port);
	}

}
