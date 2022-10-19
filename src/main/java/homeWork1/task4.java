package homeWork1;

public class task4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = 'b' + s + 'b';

        int start = 0;
        int end = s.length() - 1;
        boolean res = false;
        while (start < s.length()){
        //for (int i = 0; i < s.length() || end > -1 || start < s.length(); i ++) {
            while (!Character.isLetterOrDigit(s.charAt(start))) {
                start ++;
            }
            while (!Character.isLetterOrDigit(s.charAt(end))) {
                end --;
            }
            if (s.charAt(start) == s.charAt(end)){
                res = true;
            }
            else return false;//res = false;
            start ++;
            end --;
        }
        if (s.isEmpty()) {
            return res;
        }
        return res;
    }

}
