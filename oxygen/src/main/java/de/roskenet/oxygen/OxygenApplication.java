package de.roskenet.oxygen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OxygenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OxygenApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Hello World!"); 
    }

}
