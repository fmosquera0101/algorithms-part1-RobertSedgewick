package com.com.fredymosquera.part1;

import java.util.Arrays;

public class ExercisesCh1 {
    public static void main(String[] args) {
        System.out.println((0 + 15) /2);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true && false || true && true);

        System.out.println("-----------");
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(1+2+"3");

        System.out.println("-----------");
        System.out.println(threeEquals(1, 4, 1));
        System.out.println("-----------");
        System.out.println(doubleStrictlyBetween1_0(0.2, 1.0) );

        //Fibonacci
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001){
            t = (9.0/t + t) / 2;
        }
        System.out.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000 ; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < 1000 ; i++) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println("-----------");

        int N = 8;
        System.out.println(Integer.toBinaryString(N));
        String s = "";
        for (int i = N; i >0 ; i = i /2) {
            s = (i%2) + s;
        }
        System.out.println(s);
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 9 - i;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(arr));



    }

    private  static boolean threeEquals(int a, int b, int c){
        return (a == b & a == c && b == c);
    }
    private static boolean doubleStrictlyBetween1_0(double x, double y){
        return (x >= 0 && x <= 1) && (y >= 0 && y <= 1);
    }
}
