package workshop.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class KillerApplicationImpl implements KillerApplication {

    private Performer performer;

    public KillerApplicationImpl(Performer performer) {
        this.performer = performer;
    }

    @Override
    public void start() {
        performer.doSomething();
    }
}
