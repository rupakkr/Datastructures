package com.rpk.dsa.competitiveprograming.practice;

import java.util.Scanner;

/**
 * A. Gregor and Cryptography
 * time limit per test1 second
 * memory limit per test256 megabytes
 * inputstandard input
 * outputstandard output
 * Gregor is learning about RSA cryptography, and although he doesn't understand how RSA works, he is now fascinated with prime numbers and factoring them.
 *
 * Gregor's favorite prime number is ๐
 * P
 * . Gregor wants to find two bases of ๐
 * P
 * . Formally, Gregor is looking for two integers ๐
 * a
 *  and ๐
 * b
 *  which satisfy both of the following properties.
 *
 * ๐mod๐=๐mod๐
 * P
 * mod
 * a
 * =
 * P
 * mod
 * b
 * , where ๐ฅmod๐ฆ
 * x
 * mod
 * y
 *  denotes the remainder when ๐ฅ
 * x
 *  is divided by ๐ฆ
 * y
 * , and
 * 2โค๐<๐โค๐
 * 2
 * โค
 * a
 * <
 * b
 * โค
 * P
 * .
 * Help Gregor find two bases of his favorite prime number!
 *
 * Input
 * Each test contains multiple test cases. The first line contains the number of test cases ๐ก
 * t
 *  (1โค๐กโค1000
 * 1
 * โค
 * t
 * โค
 * 1000
 * ).
 *
 * Each subsequent line contains the integer ๐
 * P
 *  (5โค๐โค109
 * 5
 * โค
 * P
 * โค
 * 10
 * 9
 * ), with ๐
 * P
 *  guaranteed to be prime.
 *
 * Output
 * Your output should consist of ๐ก
 * t
 *  lines. Each line should consist of two integers ๐
 * a
 *  and ๐
 * b
 *  (2โค๐<๐โค๐
 * 2
 * โค
 * a
 * <
 * b
 * โค
 * P
 * ). If there are multiple possible solutions, print any.
 *
 * Example
 * inputCopy
 * 2
 * 17
 * 5
 * outputCopy
 * 3 5
 * 2 4
 * Note
 * The first query is ๐=17
 * P
 * =
 * 17
 * . ๐=3
 * a
 * =
 * 3
 *  and ๐=5
 * b
 * =
 * 5
 *  are valid bases in this case, because 17mod3=17mod5=2
 * 17
 * mod
 * 3
 * =
 * 17
 * mod
 * 5
 * =
 * 2
 * . There are other pairs which work as well.
 *
 * In the second query, with ๐=5
 * P
 * =
 * 5
 * , the only solution is ๐=2
 * a
 * =
 * 2
 *  and ๐=4
 * b
 * =
 * 4
 * .2
 */
public class GregorAndCryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){
            int p = scanner.nextInt();
            printPrimeBase(p);
            t--;
        }
    }

    private static void printPrimeBase(int p) {
        int a=2;
        int b=p-1;

        System.out.println(a+" "+b);
    }
}
