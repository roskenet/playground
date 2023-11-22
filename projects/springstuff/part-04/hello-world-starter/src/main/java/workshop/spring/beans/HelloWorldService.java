package workshop.spring.beans;

public class HelloWorldService implements KillerService {

    @Override
    public String greeting() {
        return "Hello World!";
    }
}
