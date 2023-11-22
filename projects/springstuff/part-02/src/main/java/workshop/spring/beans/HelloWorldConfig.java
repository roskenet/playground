package workshop.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
