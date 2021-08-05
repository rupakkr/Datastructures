package com.rpk.dsa.arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        while(i < n){
           if(nums[i] != 0) {
               nums[j++] = nums[i];
           }
           i++;
        }
        while (j < n){
            nums[j++] =0;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
        int[] nums = {0,1,0,5};
        moveZeroes(nums);
        for (int i : nums)
            System.out.println(i);
    }
}
