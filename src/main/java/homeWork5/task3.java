package homeWork5;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        String[] words1 = new String[]{"leetcode","is","amazing","as","is"};
        String[] words2 = new String[]{"amazing","leetcode","is"};

        System.out.println(Solution1.countWords(words1, words2));
    }
}
class Solution1 {
    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int res = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words1.length; i++) { //складываем в мапу все слова у уникальных значение 1
            String curStr = words1[i];
            map.putIfAbsent(curStr, 0);
            map.put(curStr, map.get(curStr) + 1); //у не уникальных больше одного
        }

        for (var entry : map.entrySet()) {
            int curVal = entry.getValue();
            if (curVal > 1) {
                map.remove(entry);
            }
        }


        for (int i = 0; i < words2.length; i++) { //сравниваем второй массив с мапой
            String curStr = words2[i];
            if (map.containsKey(curStr) && map.get(curStr) <= 1 ) {  //если в мапе есть наше слово
                map.put(curStr, map.get(curStr) - 1);      //
            }                                              //уникальные для первого и второго будут с 0
            //остальные со значением меньше нуля или больше
        }

        for (var entry : map.entrySet()) {            //считаем нули
            int curVal = entry.getValue();            //получаем неверный результат
            if (curVal == 0) {
                res += 1;
            }
        }

        return res;
    }
}