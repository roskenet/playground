package de.roskenet.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Field {
    private final int row;
    private final int column;

    private int value = 0;
    private Set<Integer> pencilmarks = new HashSet<>(9);

    public Field(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Field(int row, int column, int value) {
        this(row, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
