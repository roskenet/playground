package springpg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PgCliApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PgCliApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello world");
    }
}
