package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Field implements Updateable {
    private Set<Integer> marks;

    private int value;
    private int row;
    private int column;

    private Sudoku puzzle;

    public Field(int row, int column, Sudoku puzzle) {
        value = 0;
        marks = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));
        this.row = row;
        this.column = column;
        this.puzzle = puzzle;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value != 0) {
            this.value = value;
            marks.removeAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
            updateFriends(value);
        }
    }

    @Override
    public void removeMark(int mark) {
       marks.remove(Integer.valueOf(mark));
       if(marks.size() == 1) {
           setValue(marks.stream().findFirst().get());
       }
    }

    private void updateFriends(int mark) {
        for (Updateable friend : puzzle.getFriendsFor(row, column)) {
            if (friend != this)
                friend.removeMark(mark);
        }
    }
}
