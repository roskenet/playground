package de.roskenet.sudoku;

public class Field {
    private final int row;
    private final int column;

    private int value = 0;
    private int[] pencilmarks = new int[] {1,2,3,4,5,6,7,8,9};

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
