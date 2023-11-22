package workshop.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public Performer juggler() {
        return new Juggler();
    }

    @Bean
    public KillerApplication killerApplication(Performer performer) {
        return new KillerApplicationImpl(performer);
    }
}
