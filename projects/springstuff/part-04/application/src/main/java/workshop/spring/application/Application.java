package workshop.spring.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import workshop.spring.beans.KillerApplication;
import workshop.spring.beans.KillerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private KillerService killerService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(killerService.greeting());
    }
}
