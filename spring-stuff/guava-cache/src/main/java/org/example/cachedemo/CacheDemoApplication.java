package org.example.cachedemo;

import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.cache.guava.GuavaCache;

@SpringBootApplication
@EnableCaching
public class CacheDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CacheDemoApplication.class, args);
    }

    @Autowired
    private SomethingCache cache;

    @Autowired
    private Cache theCache;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello World");

        cache.transformMe("Irgendwas");

        Thread.sleep(1000);

        cache.transformMe("Irgendwas");

        Thread.sleep(5000);

        cache.transformMe("Irgendwas");

    }
}
