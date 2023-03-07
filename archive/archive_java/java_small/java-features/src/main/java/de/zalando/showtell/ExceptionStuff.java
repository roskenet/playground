package de.zalando.showtell;

public class ExceptionStuff {

    public void doSomething() throws Throwable {
        System.out.println("Hello World!");
    }

    public void caller() {
        doSomething();
    }
}
