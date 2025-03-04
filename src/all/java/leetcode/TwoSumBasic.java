package all.java.leetcode;

import java.util.Arrays;

public class TwoSumBasic {

    public static int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] values = twoSum(new int[]{3, 2, 4}, 6);

        System.out.println("OUTPUT: " + Arrays.toString(values));

        if (Arrays.toString(values).equals("[1, 2]"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

    }

}
