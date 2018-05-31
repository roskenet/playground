package de.roskenet.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiguryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguryApplication.class, args);
	}
}
