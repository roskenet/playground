package poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    private JsonvalsRepository repository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");

//        repository.deleteAll();
//        saveCoolValue();
        var all = repository.findAll();

        all.forEach(System.out::println);

//        saveCoolValue();


    }

    private void saveCoolValue() {
        var jsonvals = new Jsonvals();
        jsonvals.setItem("{ \"value\": \"cool value\" }");
        jsonvals.setStatus(Status.ACTIVE);
        repository.save(jsonvals);
    }
}
