package org.example;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello Sudoku Lover!" );

        Sudoku thePuzzle = new Sudoku();
        thePuzzle.setField(0, 0, 4);
        thePuzzle.setField(0, 1, 9);
        thePuzzle.setField(0, 2, 3);

        thePuzzle.setField(1, 0, 1);
        thePuzzle.setField(1, 1, 8);
        thePuzzle.setField(1, 2, 6);

        thePuzzle.setField(2, 0, 2);
        thePuzzle.setField(2, 1, 5);

        var fieldValue = thePuzzle.getFieldValue(2, 2);
        System.out.println(fieldValue);
    }
}
