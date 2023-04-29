package de.roskenet.sudoku;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * Naive Sudoku playground
 */
public class Sudoku {

    private final int[][] puzzle;

    public Sudoku() {
        puzzle = new int[9][9];
    }

    public Sudoku(int[][] puzzle) {
        this.puzzle = puzzle;
    }

    public int solve() {
        var start = Instant.now();

        var end = Instant.now();
        return end.getNano()-start.getNano();
    }


    public boolean isSolved() {
        for (int[] horizRow: puzzle) {
            if(!isRowComplete(horizRow)) {
                return false;
            }
        }

        for(int x = 0; x < 9; x++) {
            int[] vertRow = new int[9];
            for (int y = 0; y < 9; y++) {
                vertRow[y]= puzzle[y][x];
            }
            if(!isRowComplete(vertRow)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isRowComplete(int[] row) {
        Set<Integer> set = new HashSet<>();
        for (int i : row) {
            if(i == 0) {
                return false;
            }
            if(i < 0 || i > 9) {
                throw new IllegalStateException("The puzzle is in a incorrect state.");
            }
            set.add(i);
        }

        if (set.stream().count() != 9) {
            return false;
        }
        else {
            return true;
        }
    }
}
