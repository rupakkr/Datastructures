package com.rpk.dsa.arrays;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Note:
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int duplicateZeroIndex;
        for(int i=0; i< arr.length ; i++){
            if(arr[i] == 0){
                duplicateZeroIndex = i;
                shiftElements(arr,duplicateZeroIndex);
                i++;
            }

        }
    }

    public static void shiftElements(int[] arr, int elmentIndex){
        for(int i = arr.length -1 ; i>elmentIndex ; i--){
            arr[i] = arr[i-1];
        }

        arr[elmentIndex] = 0;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        printArray(nums);
    }
}
