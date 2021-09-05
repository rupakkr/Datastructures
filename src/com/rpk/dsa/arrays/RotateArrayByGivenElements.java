package com.rpk.dsa.arrays;

import java.util.Scanner;

/**
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
 *
 * Input:
 * The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
 *
 * Output:
 * For each testcase, in a new line, output the rotated array.
 *
 * Constraints:
 * 1 <= T <= 200
 * 1 <= N <= 107
 * 1 <= D <= N
 * 0 <= arr[i] <= 105
 *
 * Example:
 * Input:
 * 2
 * 5 2
 * 1 2 3 4 5
 * 10 3
 * 2 4 6 8 10 12 14 16 18 20
 *
 * Output:
 * 3 4 5 1 2
 * 8 10 12 14 16 18 20 2 4 6
 *
 * Explanation :
 * Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
 */

public class RotateArrayByGivenElements {

    private static void rotateArray(int[] arr, int n, int d) {

        // Stroe first d elements in temp array
        for(int i=0; i<d;i++){
           rotateLeftOneByOne(arr,n);
        }


        for(int i:arr){
            System.out.println(i);
        }


    }

    private static void rotateLeftOneByOne(int[] arr, int n) {
        // rotate Array to left
        int temp=arr[0];

        for(int j=0; j < n-1; j++){
            arr[j]=arr[j+1];
        }

        arr[n-1]= temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();// Number of test cases

        while( T > 0){
            int N = sc.nextInt();//Size of the array
            int D = sc.nextInt();

            // inout Array
            int[] arr = new int[N];

            for (int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }

            rotateArray(arr,N,D);

            T--;
        }
    }

}
