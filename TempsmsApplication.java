package com.rk.otp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.rk.app.properties.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@EnableScheduling
@ComponentScan(basePackages = "com.rk")
@EnableJpaRepositories(basePackages = "com.rk")
@EntityScan(basePackages = "com.rk")
public class TempsmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempsmsApplication.class, args);
	}

}
