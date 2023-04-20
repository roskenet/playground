package generics;

import java.util.ArrayList;
import java.util.List;

class MyParamClass<T extends String> {
    public T writeT() {
    }
}

public class Basics {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
    }
}
