package de.roskenet.hydrogen;

public class Something {

    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Something{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
