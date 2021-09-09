package com.rpk.dsa.arrays;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 *
 * Input: nums = []
 * Output: []
 * Example 3:
 *
 * Input: nums = [0]
 * Output: []
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        if(nums.length < 3){
            return list;
        }


        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k=nums.length - 1;

            while(j<k){
                if(nums[i] + nums[j]+nums[k] > 0){
                    k-=1;
                } else if(nums[i] + nums[j]+nums[k] < 0){
                    j+=1;
                } else {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j+=1;
                    while(j<k && nums[j] == nums[j-1]){
                        j+=1;
                    }
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.print("[");
        for(List<Integer> l : threeSum(nums)){
            System.out.print("[");
            for(Integer i : l){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("] ");

        }
        System.out.print("]");


    }
}
