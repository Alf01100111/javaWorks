package homeWork1;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] arr = buildArray(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < (nums.length); i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
