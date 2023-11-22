package workshop.spring.beans;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
public class HelloWorldConfig {

    @Bean
    public KillerService killerService() {
        return new HelloWorldService();
    }

    @Bean
    public KillerApplication killerApplication(KillerService killerService) {
        return new KillerApplicationImpl(killerService);
    }
}
