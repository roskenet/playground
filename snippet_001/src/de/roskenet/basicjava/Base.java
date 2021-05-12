package de.roskenet.basicjava;

import java.util.Objects;

public class Base {

    private String someString;
    private int someInt;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public void doSomething() {
        System.out.println("This does something!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Base base = (Base) o;
        return someInt == base.someInt && Objects.equals(someString, base.someString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someString, someInt);
    }
}
