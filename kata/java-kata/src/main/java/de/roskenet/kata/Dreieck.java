package de.roskenet.kata;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
//        System.out.print("Please enter the base: ");
//        var base = new Scanner(System.in).nextInt();
//        if (base%2 != 1)
//            throw new IllegalArgumentException("Base must be odd!");

        var base = 13;

        for(int x = 0; x < base; x++) {
            System.out.print('*');
        }
        System.out.print('\n');

        for(int line=1; line < base/2; line++) {
           StringBuilder sb = new StringBuilder();
            var length = base - line * 2;

            for (int x=0; x < line; x++) {
                sb.append(' ');
            }
            sb.append('*');
            for (int x=0; x < length-2; x++) {
                sb.append(' ');
            }
            sb.append('*');
            System.out.println(sb);
        }

        for (int x=0; x < base/2; x++) {
            System.out.print(' ');
        }
        System.out.println('*');
    }
}
