package de.roskenet.springcliplayground;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringCliPlaygroundApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringCliPlaygroundApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello World!");
        try {
            String doSomething = doSomething(null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static String doSomething(List<String> param) throws Exception {
        throw new RuntimeException("MyException");
    }

//    public static String doSomething(List<Integer> param) {
//        return "Integer";
//    }
}
