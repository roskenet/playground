package de.roskenet.sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Field {

    private Set<Integer> marks;

    public Field() {
        marks = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    public void removeMark(int value) {
        marks.remove(value);
    }

    public Set<Integer> getMarks() {
       return marks;
    }
}
