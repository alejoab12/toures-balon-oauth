package com.toures.balon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = { "com.toures.balon", "com.gema.autentication" })
public class TouresBalonOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouresBalonOauthApplication.class, args);
	}

}
