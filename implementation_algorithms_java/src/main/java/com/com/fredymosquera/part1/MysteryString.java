package com.com.fredymosquera.part1;

public class MysteryString {
    public static void main(String[] args) {
        System.out.println(misteryString("fredy"));
    }
    private static String misteryString(String s){

        int n = s.length();
        if(n <= 1){
            return s;
        }
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);

        return misteryString(b) + misteryString(a);
    }
}
