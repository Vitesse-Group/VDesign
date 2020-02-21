package com.vitesse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(VDesignApplication.class, args);
	}

}
