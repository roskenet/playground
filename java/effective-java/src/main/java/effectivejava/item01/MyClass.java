package effectivejava.item01;

import java.util.function.Function;

public class MyClass {
    private Function<String, String> stdFunc;

    private MyClass(Function<String, String> stdFunc) {
        this.stdFunc = stdFunc;
    };

    public static MyClass getInstance(Function<String, String> stdFunction) {
        return new MyClass(stdFunction);
    }

    public String doSomething(String arg) {
       return stdFunc.apply(arg);
    }

}
