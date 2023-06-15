package gernerics;

public class Statics {

    public Statics() {
        System.out.println("This is the Statics CTOR!");
    }

    public static void main(String[] args) {
        Statics.doSomething();
    }

    private static void doSomething() {
        System.out.println("DoSomething");
    }
}
