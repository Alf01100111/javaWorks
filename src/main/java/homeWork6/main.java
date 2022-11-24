package homeWork6;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "mur", 1, "black");
        Cat cat2 = new Cat(2, "vasa", 3, "white");
        Cat cat3 = new Cat(3, "sem", 2, "grey");
        Cat cat4 = new Cat(3, "sem", 2, "grey");

        HashSet<Cat> h = new HashSet<Cat>();
        h.add(cat1);
        h.add(cat2);
        h.add(cat3);
        h.add(cat4);

        System.out.println(cat3.equals(cat4));

        System.out.println(cat4.hashCode());

        System.out.println(h);
    }
}
