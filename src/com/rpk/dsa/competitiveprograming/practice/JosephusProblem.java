package com.rpk.dsa.competitiveprograming.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * for the given number of person and kill size(k), return the last person standing.
 */
public class JosephusProblem {

    public static void main(String[] args) {
        // this code for the k=7 and number of persons =40;

        int k=7;
        int n=40;
        List<Integer> persons = new ArrayList<>();
        int posSwordHolder = 0;
        for(int i=0; i< n; i++){
            persons.add(i+1);
        }
        k--;
        int result = solve(persons,k,posSwordHolder);
        System.out.println(result);
    }

    private static int solve(List<Integer> persons, int k, int posSwordHolder) {
        // base case
        if (persons.size() == 1){ ;
            return persons.get(0);
        }

        int killIndex = (posSwordHolder + k)%persons.size();
        persons.remove(killIndex);
        posSwordHolder = killIndex;
        return solve(persons,k,posSwordHolder);

    }
}
