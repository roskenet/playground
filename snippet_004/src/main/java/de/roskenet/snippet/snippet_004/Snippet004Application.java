package de.roskenet.snippet.snippet_004;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Snippet004Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Snippet004Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
    }
}
