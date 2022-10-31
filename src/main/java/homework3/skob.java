package homework3;

import java.util.Stack;

public class skob {
    public static boolean isValid(String s) {

        Stack<Character> stackSkob = new Stack<>();
        // каждую скобку по отдельности в массив
        for (char j : s.toCharArray()) {
            // если встретили открывающую скобку
            if (j == '(' || j == '{' || j == '[') {
                // кладём в стэк
                stackSkob.push(j);
            }
            //если встретим пару удалим верхнюю из стэкаа
            else if (j == ')' && !stackSkob.isEmpty() && stackSkob.peek() == '(') {
                stackSkob.pop();
            } else if (j == '}' && !stackSkob.isEmpty() && stackSkob.peek() == '{') {
                stackSkob.pop();
            } else if (j == ']' && !stackSkob.isEmpty() && stackSkob.peek() == '[') {
                stackSkob.pop();
            }
            // если пары нет вернем ложь
            else {
                return false;
            }
        }
        return stackSkob.isEmpty(); // пустой возвращает тру
    }

    public static void main(String[] args) {
        String s = "((()[]{}))";
        System.out.println(isValid(s));

    }
}
