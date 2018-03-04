package com.explorer.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExplorerApplication.class, args);
	}
}
