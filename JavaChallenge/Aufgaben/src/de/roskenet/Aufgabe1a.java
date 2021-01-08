package de.roskenet;

public class Aufgabe1a {

    public static void main(String[] args) {
        System.out.println("+++ Aufgabe 1a +++");
        System.out.println("6 und 7: " + calc(6, 7));
        System.out.println("3 und 4: " + calc(3, 4));
        System.out.println("5 und 5: " + calc(5, 5));
    }

    public static int calc(final int m, final int n) {
        return (m * n / 2) % 7;
    }
}
