package workshop.spring;

public class PartyApp {

    private Performer performer;

    PartyApp(Performer performer) {
        this.performer = performer;
    }

    public void start() {
       performer.doSomething();
    }

    public static void main( String[] args ) {
        PartyApp app = new PartyApp(new Juggler());
        app.start();
    }
}
