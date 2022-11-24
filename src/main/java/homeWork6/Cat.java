package homeWork6;

import java.util.HashSet;
import java.util.Objects;

public class Cat {
    private int id;
    private String name;
    private int age;
    private String color;

    public Cat(int id, String name, int age, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    @Override
    public String toString() {
        return ("id: "+ id + " name: " + name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return id == cat.id && age == cat.age && name.equals(cat.name) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
