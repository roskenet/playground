package workshop.spring.beans;

public class KillerApplicationImpl implements KillerApplication {

    private KillerService killerService;
    public KillerApplicationImpl(KillerService killerService) {
        this.killerService = killerService;
    }

    @Override
    public void start() {
        System.out.println(killerService.greeting());
    }
}
