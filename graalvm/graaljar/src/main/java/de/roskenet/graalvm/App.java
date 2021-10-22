package de.roskenet.graalvm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
<<<<<<< HEAD:graalvm/graaljar/src/main/java/de/roskenet/graalvm/App.java
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("This is a message from a native compiled application.");
=======
    public static void main( String[] args ) {
        System.out.println("What's your name, buddy? ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String name = br.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Some unrecoverable error happened. I better quit!");
        }
>>>>>>> origin/master:java/graalvm/graaljar/src/main/java/de/roskenet/graalvm/App.java
    }
}
