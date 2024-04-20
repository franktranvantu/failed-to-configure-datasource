package com.franktranvantu.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
	}

}
