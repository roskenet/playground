package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Field implements Updateable {
    private Set<Integer> marks;

    private int value;

    private List<Updateable> friends = new ArrayList<>();

    public Field() {
        value = 0;
        marks = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));
    }

    public void setValue(int value) {
        this.value = value;
        marks.removeAll(List.of(1,2,3,4,5,6,7,8,9));
        updateFriends(value);
    }

    @Override
    public void removeMark(int mark) {
       marks.remove(Integer.valueOf(mark));
       if(marks.size() == 1) {
           setValue(marks.stream().findFirst().get());
       }
    }

    private void updateFriends(int mark) {
        for (Updateable friend : friends) {
            friend.removeMark(mark);
        }
    }
}
