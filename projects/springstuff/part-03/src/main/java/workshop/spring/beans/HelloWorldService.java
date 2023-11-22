package workshop.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService implements KillerService {

    @Override
    public String greeting() {
        return "Hello World!";
    }
}
