package applications.example_C;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableJpaRepositories("applications.commons")
@EntityScan("applications.commons")
public class ExampleC implements CommandLineRunner {

    @Autowired
//    private ServiceB service;

    public static void main(String[] args) {
        SpringApplication.run(ExampleC.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {

//       service.doSomething();


    }
}
