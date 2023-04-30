package de.roskenet.sudoku;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * Naive Sudoku playground
 */
public class Sudoku {

    private Field[][] puzzle = new Field[9][9];

    public static Sudoku of(int[][] puzzle) {
        var sudoku = new Sudoku();
        for (int y = 0; y < 9; y++) {
            for(int x = 0; x < 9; x++) {
                sudoku.puzzle[y][x] = new Field(y, x, puzzle[y][x]);
            }
        }
        return sudoku;
    }

    public static Sudoku empty() {
        var sudoku = new Sudoku();
        for (int y = 0; y < 9; y++) {
            for(int x = 0; x < 9; x++) {
                sudoku.puzzle[y][x] = new Field(y, x, 0);
            }
        }
        return sudoku;
    }

    private Sudoku() {}

    public int solve() {
        var start = Instant.now();

        var end = Instant.now();
        return end.getNano()-start.getNano();
    }

    public boolean setField(int row, int column, int value) {
        assertArguments(row, column, value);

//        puzzle[row][column] = value;

        return isSolved();
    }

    private void assertArguments(int x, int y, int value) {
        if(x < 0 || x > 0) {
            throw new IllegalArgumentException(String.format("x is [%d]", x));
        }
        if(y < 0 || y > 0) {
            throw new IllegalArgumentException(String.format("y is [%d]", y));
        }
        if(value < 0 || value > 0) {
            throw new IllegalArgumentException(String.format("value is [%d]", value));
        }
    }

    public boolean isSolved() {
        for (Field[] horizRow: puzzle) {
            if(!isRowComplete(horizRow)) {
                return false;
            }
        }

        for(int x = 0; x < 9; x++) {
            Field[] vertRow = new Field[9];
            for (int y = 0; y < 9; y++) {
                vertRow[y] = new Field(y, x, puzzle[y][x].getValue());
            }
            if(!isRowComplete(vertRow)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isRowComplete(Field[] row) {
        Set<Integer> set = new HashSet<>();
        for (Field f : row) {
            if(f.getValue() == 0) {
                return false;
            }
            if(f.getValue() < 0 || f.getValue() > 9) {
                throw new IllegalStateException("The puzzle is in a incorrect state.");
            }
            set.add(f.getValue());
        }

        if (set.stream().count() != 9) {
            return false;
        }
        else {
            return true;
        }
    }
}
