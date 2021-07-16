package com.rpk.dsa.arrays;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 */
public class FindEvenDigitNumbers {
    public static int findNumbers(int[] nums) {

        int numberOfDigits;
        int countOfEvenDigitNumbers=0;
        for (int num : nums) {
            numberOfDigits = countNumberOfDigit(num);
            if (numberOfDigits % 2 == 0) {
                countOfEvenDigitNumbers++;
            }
        }

        return countOfEvenDigitNumbers;
    }


    public static int countNumberOfDigit(int number){

        if(number/10 == 0){
            return 1;
        }

        return 1 + countNumberOfDigit(number/10);

    }

    public static void main(String[] args) {
//       int[] nums={555,901,482,1771};
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
