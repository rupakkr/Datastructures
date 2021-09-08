package com.rpk.dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 */

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {

        return Arrays.stream(nums).boxed().sorted((a,b) -> Integer.compare(a%2,b%2)).mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums= {3,1,2,4};

         nums = sortArrayByParity(nums);

         for(int i=0; i< nums.length; i++)
             System.out.println(nums[i]);


    }
}
