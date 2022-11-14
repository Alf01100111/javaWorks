package homework;

import java.util.HashMap;
import java.util.Map;

public class Sem5 {
    public static void main(String[] args) {
        String text = " ljkj;j l;jklj kl;jkjlj kljljkljj333";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char curChar = text.charAt(i);
            map.putIfAbsent(curChar, 0);
            map.put(curChar, map.get(curChar) + 1);
        }

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
