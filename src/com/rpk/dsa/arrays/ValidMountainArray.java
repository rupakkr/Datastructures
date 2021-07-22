package com.rpk.dsa.arrays;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 *
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 */
public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if(arr == null || arr.length < 3){
            return false;
        }
        int level=0;// 0- flat,-1-> climb down, 1 -> climb up
        int i=0;
        int j=1;
        int length=arr.length;
        boolean result=false;

        while(i < j && j<length){
            int stepper = arr[j]-arr[i];
            if(stepper == 0 || (level < 0 && stepper > 0) || (level == 0 && stepper < 0) ){
                return false;
            }

            level = stepper;

            i++;
            j++;

            // Edge case
            if(j == arr.length && level < 0){
                // System.out.println("i = "+i);
                // System.out.println("j = "+j);
                result = true;
            }


        }
        return result;
    }


    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));
    }
}
