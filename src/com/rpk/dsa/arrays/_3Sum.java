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
        // Edge Cases
        if(nums == null || nums.length ==0 || (nums.length == 2 && nums[0] ==0 && nums[1] ==0)){
            return list;
        }

        for(int i=0; i< nums.length ; i++){
            int target = 0-nums[i];
            List<Integer> l = twoSum(nums,target,i);
            if(l.size() > 1){
                l.add(nums[i]);

                if (checkDuplicate(list,l)){
                    continue;
                }
                list.add(l);

            }
        }
        return list;
    }

    public static List<Integer> twoSum(int[] nums, int target, int index){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            map.put(nums[i],i);
        }

        for(int j=0; j< nums.length; j++){
            int targetValue = target - nums[j];
            // System.out.println(targetValue);
            if(map.containsKey(targetValue) && map.get(targetValue) != j && map.get(targetValue) != index){
                // System.out.println(j);
                list.add(nums[j]);
                list.add(targetValue);
                break;
            }
        }
        return list;
    }

    public static Boolean checkDuplicate(List<List<Integer>> list, List<Integer> l){
        for(List lt : list){
            Boolean check = compareTwoList(lt,l);
            if (check)
                return true;
        }

        return false;
    }

    public static Boolean compareTwoList(List<Integer> list1, List<Integer> list2){
        Set<Integer> set = new HashSet<>(list1);

        return list1.size() == list2.size() && set.containsAll(list2);
    }

    public static void main(String[] args) {



    }
}
