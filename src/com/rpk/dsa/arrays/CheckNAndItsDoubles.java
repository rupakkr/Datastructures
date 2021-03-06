package com.rpk.dsa.arrays;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 *
 * Constraints:
 *
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 */

public class CheckNAndItsDoubles {
    public static boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length == 0 || arr.length == 1){
            return false;
        }
        int length = arr.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2* arr[i]){
                   return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int[] arr = {10,2,5,3};
//        int[] arr = {7,1,14,11};
//        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
}
