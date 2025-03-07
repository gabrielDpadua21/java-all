package all.java.leetcode;

import java.util.Arrays;

/**
 *
 * @autor Gabriel D. Padua
 * @version 1.0
 * @since 1.0
 */
public class TwoSumBasic {

    // FIXME: criar método mais eficiente

    /**
     *
     * @param nums
     * @param target
     * @return
     */
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

        // TODO: adcionar teste unitário

        int[] values = twoSum(new int[]{3, 2, 4}, 6);

        System.out.println("OUTPUT: " + Arrays.toString(values));

        if (Arrays.toString(values).equals("[1, 2]"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

    }

}
