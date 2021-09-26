package com.rpk.dsa.competitiveprograming.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidateBracketString {
    public static boolean validateBrackets(String str){
        HashMap<Character, Character> openCloseMap = new HashMap<>();
        openCloseMap.put('(',')');
        openCloseMap.put('{','}');
        openCloseMap.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(Character ch: str.toCharArray()){
            if(openCloseMap.containsKey(ch)){
                stack.push(ch);
            } else if(openCloseMap.containsValue(ch)){
                if(stack.isEmpty() || !openCloseMap.get(stack.pop()).equals(ch)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(validateBrackets(str));
    }
}
