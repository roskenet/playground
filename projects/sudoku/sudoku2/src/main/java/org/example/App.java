package org.example;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello Sudoku Lover!" );

        Sudoku thePuzzle = new Sudoku(puzzle);

        System.out.println(thePuzzle);
    }

    private static int [][] puzzle = new int[][] {
            {0,0,5,0,0,9,0,0,0},
            {0,7,0,0,6,0,3,0,0},
            {0,0,4,1,2,0,7,5,0},
            {8,1,9,0,7,0,4,6,0},
            {0,0,0,0,0,0,0,0,0},
            {0,5,3,0,9,0,8,1,7},
            {0,4,1,0,5,2,6,0,0},
            {0,0,7,0,3,0,0,4,0},
            {0,0,0,4,0,0,9,0,0}
    };

}
