package com.rpk.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sums {
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums,0,4,target);
    }

    private static List<List<Integer>> kSum(int[] nums,int start,int k,int target) {
        List<List<Integer>> list = new ArrayList<>();

        if(nums.length < k || nums[start]*k > target || nums[nums.length-1]*k < target){
            return list;
        }

        if(k==2){
            return twoSum(nums,start,target);
        }

        for(int i=start; i< nums.length; i++){
            if(i==start && nums[i] != nums[i-1]){
               for(List<Integer> subList : kSum(nums,i+1,k-1,target-nums[i])){
                   list.add(new ArrayList<>(Arrays.asList(nums[i])));
                   list.get(list.size()-1).addAll(subList);

               }
            }
        }

        return list;
    }

    private static List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int lo = start;
        int hi = nums.length;

        while (lo < hi){
            int currSum = nums[lo] + nums[hi];
            if (currSum < target || (lo > start && nums[lo] == nums[lo-1])){
                lo+=1;
            } else if(currSum > target || (hi < nums.length-1 && nums[hi] == nums[hi+1])){
                hi-=1;
            } else{
                list.add(Arrays.asList(nums[lo++],nums[hi--]));
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
