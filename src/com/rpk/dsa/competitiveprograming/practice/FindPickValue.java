package com.rpk.dsa.competitiveprograming.practice;

/**
 * Inout is arr = [5,7,8,16,25,50,47,19,-1] - pk value = 50
 *          arr1 = [5,7,8,16,25,50] - 50
 *          arr2= [50,47,19,-1] - 50
 *          mid = 1+(0+3)/2
 *          19
 *          mid = 1 + (0+2)
 *
 *      0-8
 *      mid = 4, 25
 *      left = mid+1 = 5
 *      rigth = 8
 *
 *      mid = 6
 *      47
 *      left = 5
 *      rigth = 6-1 = 5
 *       left = ri
 *       [5,7,8,16,25,50,47,19,-1,-2]
 *       left=0,right=9, mid=4
 *       mid value = 25
 *       left = 4+1 =. right 9, mid = 7
 *       mid value = 19
 *       left = 5, right=6
 *
 *
 *
 *
 *          25 is mid
 *
 * 25 < 50
 *  then
 *  mid 2
 *  47 > 19
 *  then
 *  mid - 1
 *  50
 *
 * --- binary search -
 *     find the mid of the array
 *         if mid of the array is < mid +1
 *         then go to left sub array and reapeat
 */

public class FindPickValue {

    public static void main(String[] args) {

        int[] arr = {5,7,8,16,25,50};
        int length = arr.length;
        System.out.println(getHighestValue(arr,0,length-1));
    }

    private static int getHighestValue(int[] arr, int left, int right) {
        int mid = (left+right)/2;
        int res = Integer.MIN_VALUE;
        // base case 1
        if(left == right){
            return arr[left];
        }
        // base case 2
        if(right - left ==1){
            return arr[left];
        }

        // recursive call
        if(arr[mid] < arr[mid+1]){
            return getHighestValue(arr,mid+1,right);
        } else {
             return getHighestValue(arr,left,mid-1);
        }

    }
}
