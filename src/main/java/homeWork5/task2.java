package homeWork5;

//Given an integer array nums and an integer k, return true if there are two distinct indices
//      i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1,0,1,1};
        int k1 = 1;

        System.out.println(containsNearbyDuplicate(nums1, k1));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            map.putIfAbsent(curNum, i);
            int res = -1;

            if (map.containsKey(nums[i + 1])) {
                int temp = map.get(nums[i + 1]);
                res = (i + 1) - map.get(nums[i + 1]);
                if (res < 0) {
                    res *= -1;
                }
                return k >= res;
            }

        }
        return false;
    }
}

