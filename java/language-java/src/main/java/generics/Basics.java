package generics;

import java.util.ArrayList;
import java.util.List;

public class Basics {

    public static void main(String[] args) {

        // This works of course (because Integer is a subclass of Number:
        Number number = Integer.valueOf(42);

        // This works, too:
        Integer[] integerArray = new Integer[]{1, 2, 3};
        Number[] numberArray = integerArray;

        // But this doesn't...
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        List<Number> numberList = integerList;

        // Why? ;-)
    }
}
