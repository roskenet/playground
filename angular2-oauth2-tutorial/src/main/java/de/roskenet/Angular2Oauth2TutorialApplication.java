package de.roskenet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Angular2Oauth2TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(Angular2Oauth2TutorialApplication.class, args);
	}

}

