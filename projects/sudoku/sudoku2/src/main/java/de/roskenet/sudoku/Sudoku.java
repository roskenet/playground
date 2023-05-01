package de.roskenet.sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    private Set<Integer>[][] marks = new Set[9][9];

    public Sudoku() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                marks[row][col] =
                        new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
            }
        }
    }

   public Set<Integer> getMarks(int row, int col) {
        return marks[row][col];
   }

}
