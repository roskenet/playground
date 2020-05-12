package de.roskenet.example.camunda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamundaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CamundaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started CamundaApplication");
	}
}
