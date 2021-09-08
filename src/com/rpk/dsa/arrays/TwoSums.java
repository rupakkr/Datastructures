package com.rpk.dsa.arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {

        int[] indexes = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        for(int j=0; j< nums.length; j++){
            int remainingVal = target - nums[j];

            if(map.containsKey(remainingVal) && map.get(remainingVal) != j){
                indexes[0] =j;
                indexes[1] =map.get(remainingVal);
                break;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] res = twoSum(nums,target);
        for (int i=0; i< res.length; i++){
            System.out.println(res[i]);
        }

    }
}
