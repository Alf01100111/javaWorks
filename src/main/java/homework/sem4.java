package homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class sem4 {
    public static void simplifyPath(String path) {

        String[] words = path.split("/");
        System.out.println(Arrays.toString(words));

    }

    public static void main(String[] args) {
        simplifyPath("/home///../how./not...");


    }


}
