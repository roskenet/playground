package de.roskenet.riptidedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiptideDemoApplication implements CommandLineRunner {

	@Autowired
	private OxygenClient client;

	public static void main(String[] args) {
		SpringApplication.run(RiptideDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is RiptideDemoApplication!");
	}
}
