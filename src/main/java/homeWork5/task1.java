package homeWork5;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int curNum = nums1[i];
            map.putIfAbsent(curNum, 0);
            map.put(curNum, map.get(curNum) + 1);
        }

        ArrayList<Integer> resList = new ArrayList<Integer>();

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                resList.add(nums2[i]);
            }
        }

        int[] resArr = new int[resList.size()];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = resList.get(i);
        }

        return resArr;

    }
}

public class task1 {
    public static void main(String[] args) {
        int[] nums11 = new int[]{1, 2, 3, 4, 5};
        int[] nums22 = new int[]{2, 2, 3, 3, 4, 4, 6};


        System.out.println(Arrays.toString(Solution.intersect(nums11, nums22)));
    }
}
