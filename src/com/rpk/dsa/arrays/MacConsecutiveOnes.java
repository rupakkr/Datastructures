package com.rpk.dsa.arrays;


/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */

public class MacConsecutiveOnes {
    public static void main(String[] args){
        int[] nums={1,0,1,1,0,1};
        Solution solution = new Solution();
        int numberOfConsecutiveOnes = solution.findMaxConsecutiveOnes(nums);
        System.out.println(numberOfConsecutiveOnes);
    }
}

class Solution{
    public int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int maxConsecutiveOnes = 0;
        int countOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            } else {

                countOnes = 0;
            }

            if (countOnes > maxConsecutiveOnes) {
                maxConsecutiveOnes = countOnes;
            }
        }

        return maxConsecutiveOnes;

    }
}
