package de.roskenet.arsenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ArseniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArseniumApplication.class, args);
	}

}

