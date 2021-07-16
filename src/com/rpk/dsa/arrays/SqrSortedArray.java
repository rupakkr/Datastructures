package com.rpk.dsa.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SqrSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int[] res = new int[nums.length];
        int i = nums.length-1;

        while(right >= left){

            if(nums[right]*nums[right] > nums[left]*nums[left]){
                res[i] = nums[right]*nums[right];
                right--;
                i--;
            } else {
                res[i] = nums[left]*nums[left];
                left++;
                i--;
            }
        }

        return res;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }



    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int[] nums1 = sortedSquares(nums);

        printArray(nums1);

    }
}
