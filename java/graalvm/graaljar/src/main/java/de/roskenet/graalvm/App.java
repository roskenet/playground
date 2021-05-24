package de.roskenet.graalvm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) {
        System.out.println("What's your name, buddy? ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String name = br.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Some unrecoverable error happened. I better quit!");
        }
    }
}
