package homework3;

import java.util.Stack;

import static java.lang.Character.isDigit;


public class lek4stack {
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        String[] exp = tokens;
        int res = 0;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (!(exp[i].equals("+") || exp[i].equals("-") || exp[i].equals("/") || exp[i].equals("*"))) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        int temp = st.pop();
                        res = st.pop() / temp;
                        st.push(res);
                        break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

}
