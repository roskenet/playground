package org.example;

public class Sudoku {

    private Field[][] puzzle = new Field[9][9];

    private Sudoku() {
        for(int row=0; row < 9; row++) {
            for(int column=0; column < 9; column++) {
               puzzle[row][column] = new Field();
            }
        }


    }
}
