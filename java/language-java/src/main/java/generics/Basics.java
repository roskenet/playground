package generics;

import java.util.ArrayList;
import java.util.List;

//class MyParamClass<T extends String> {
//    public T writeT() {
//    }
//}

public class Basics {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[]{1, 2, 3};
        Number[] numberArray = integerArray;

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        List<Number> numberList = integerList;

    }
}
