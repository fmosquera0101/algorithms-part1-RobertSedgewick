package com.com.fredymosquera.randomnumbers;

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {
        int b = 31415821;
        int m = 100000000;
        int N = 10;
        int[] random = new int[N];
        random[0] = 1234567;
        for (int i = 1; i < N - 1 ; i++) {
            random[i] = (random[i-1] * b + 1) % m;
        }
        System.out.println(Arrays.toString(random));
    }
}
