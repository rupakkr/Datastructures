package com.rpk.dsa.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 */

// 0,0,1,1,2,2,3
// i = 0, 0==0, then i=1
// i = 1, 0 != 1 then 0,1,1,1,2,2,3, i = 2, j=1
// i = 2, 1 == 1,i =3
// i=3 and so on

public class RemoveDuplicateFrmSortedArray {
    public static int removeDuplicates(int[] nums) {
        // Edge case handling
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        
        int i=0;// index to point current element
        int j=0;// index to point unique element
        int length = nums.length;
        while(i < length-1 ){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
            i++;
        }

        nums[j++] = nums[length - 1];
        return j;
    }

    public static void printArray(int[] array, int length){
        System.out.print("[ ");
        for(int i = 0;i <  array.length; i++){
            if(i >= length){
                System.out.print("_ ");
            } else {
                System.out.print(array[i]+" ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int len = removeDuplicates(nums);
        System.out.println(len);
        printArray(nums,len);
    }
}
