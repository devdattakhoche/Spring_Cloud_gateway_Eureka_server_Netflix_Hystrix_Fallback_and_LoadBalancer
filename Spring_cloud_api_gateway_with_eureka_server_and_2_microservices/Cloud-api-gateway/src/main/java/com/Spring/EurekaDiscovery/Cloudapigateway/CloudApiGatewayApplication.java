package com.Spring.EurekaDiscovery.Cloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiGatewayApplication.class, args);
	}

}
