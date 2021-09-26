package com.rpk.dsa.competitiveprograming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPossibleBlancedpranthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> blStrings = new ArrayList<>();
        String emptyString="";
        solve(n,0,0,emptyString,blStrings);

        for(String s: blStrings){
            System.out.println(s);
        }

    }

    private static void solve(int n,int open, int close,String emptyString, List<String> list) {
        if(close ==n){
            list.add(emptyString);
            return;
        }

        if (open > close){
            emptyString = emptyString + "}";
            solve(n,open,close+1,emptyString,list);
        }

        if (open < n){
            emptyString = emptyString + "{";
            solve(n,open+1,close,emptyString,list);
        }
    }
}
