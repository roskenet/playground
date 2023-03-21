package effectivejava.item01;

public class Item01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        var instance = MyClass.getInstance(String::toLowerCase);

        System.out.println(instance.doSomething("EinTest"));
    }
}
