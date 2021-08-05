package com.rpk.dsa.arrays;

public class DeleteDuplicateElements {
    public static int deleteDuplicate(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }

        if(arr.length == 1)
            return 1;

        int i = 1;
        int j = 0;
        int n = arr.length;

        while(i < n){
            if (arr[i-1] != arr[i]){
                arr[j++] = arr[i-1];
            }
            i++;
        }

        arr[j++] = arr[n-1];

        return j;

    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //0,1,2,3,4
        System.out.println(deleteDuplicate(arr));

        for (int i : arr)
            System.out.println(i);
    }
}
