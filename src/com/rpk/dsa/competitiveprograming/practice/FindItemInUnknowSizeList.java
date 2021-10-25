package com.rpk.dsa.competitiveprograming.practice;

/**

 *
 */
public class FindItemInUnknowSizeList {


    public static  int binarySearch(int[] arr,int key,int start, int end){
        int s=start;
        int e=end;
        int mid = (s+e)/2;
        System.out.println("Start :"+s+", end : "+e+", mid : "+mid);
        if(e-s >=1) {
            try {
                if (arr[mid] == key) {
                    return mid;
                }

                if (key <= arr[mid]) {
                    return binarySearch(arr, key, s, mid);
                } else {
                    //(int) Math.pow(2,e)
                    return binarySearch(arr, key, mid + 1, 2*e);

                }
            }catch (ArrayIndexOutOfBoundsException ex){
                e = e/2;
                return binarySearch(arr, key, start, e);
            }

        } else if(e==s){
            if(arr[e]==key){
                return e;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
        int key = 28;
        System.out.println(binarySearch(arr,key,0,key));
    }
}