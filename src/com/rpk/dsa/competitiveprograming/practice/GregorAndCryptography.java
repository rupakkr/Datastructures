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
 * Gregor's favorite prime number is 𝑃
 * P
 * . Gregor wants to find two bases of 𝑃
 * P
 * . Formally, Gregor is looking for two integers 𝑎
 * a
 *  and 𝑏
 * b
 *  which satisfy both of the following properties.
 *
 * 𝑃mod𝑎=𝑃mod𝑏
 * P
 * mod
 * a
 * =
 * P
 * mod
 * b
 * , where 𝑥mod𝑦
 * x
 * mod
 * y
 *  denotes the remainder when 𝑥
 * x
 *  is divided by 𝑦
 * y
 * , and
 * 2≤𝑎<𝑏≤𝑃
 * 2
 * ≤
 * a
 * <
 * b
 * ≤
 * P
 * .
 * Help Gregor find two bases of his favorite prime number!
 *
 * Input
 * Each test contains multiple test cases. The first line contains the number of test cases 𝑡
 * t
 *  (1≤𝑡≤1000
 * 1
 * ≤
 * t
 * ≤
 * 1000
 * ).
 *
 * Each subsequent line contains the integer 𝑃
 * P
 *  (5≤𝑃≤109
 * 5
 * ≤
 * P
 * ≤
 * 10
 * 9
 * ), with 𝑃
 * P
 *  guaranteed to be prime.
 *
 * Output
 * Your output should consist of 𝑡
 * t
 *  lines. Each line should consist of two integers 𝑎
 * a
 *  and 𝑏
 * b
 *  (2≤𝑎<𝑏≤𝑃
 * 2
 * ≤
 * a
 * <
 * b
 * ≤
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
 * The first query is 𝑃=17
 * P
 * =
 * 17
 * . 𝑎=3
 * a
 * =
 * 3
 *  and 𝑏=5
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
 * In the second query, with 𝑃=5
 * P
 * =
 * 5
 * , the only solution is 𝑎=2
 * a
 * =
 * 2
 *  and 𝑏=4
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
