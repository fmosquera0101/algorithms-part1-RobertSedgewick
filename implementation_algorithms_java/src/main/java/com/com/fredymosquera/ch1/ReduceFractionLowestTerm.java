package com.com.fredymosquera.ch1;

public class ReduceFractionLowestTerm {
    public static void main(String[] args) {
        int a =  12345;
        int b =  56789;
        int gcd = findGreatestCommonDivisor(a, b);
        int gcdEuclides = finGCDEuclidesRecursive(a, b);
        int gcEuNoRecursive = finGCDEuclidesNoRecursive(a, b);

        System.out.printf("%d, %d, %d\n", gcd, gcdEuclides, gcEuNoRecursive);

        System.out.printf("%d/%d = %d/%d greates common divisor = %d\n", a, b, a/gcd, b/gcd, gcd);

        System.out.printf("%d/%d = %d/%d greates common divisor = %d\n", a, b, a / gcdEuclides, b/gcdEuclides, gcdEuclides);

        System.out.printf("%d/%d = %d/%d greates common divisor = %d\n", a, b, a / gcEuNoRecursive, b/gcEuNoRecursive, gcEuNoRecursive);
    }
    private static int findGreatestCommonDivisor(int a, int b){
        int tmp  = 0;
        if(a < b){
            tmp = a;
        }else {
            tmp = b;
        }
        while (( a % tmp != 0) || (b % tmp != 0)){
            tmp--;
        }
        return tmp;
    }
    private static  int finGCDEuclidesRecursive(int a, int b){
        if( b == 0){
            return a;
        }else {
            System.out.printf("a = %d, b= %d\n", a, b);
            return  finGCDEuclidesRecursive(b, a % b);
        }

    }

    private static  int finGCDEuclidesNoRecursive(int a, int b){
        int tmp = 0;
        while (b != 0){
            tmp = a % b;
            a = b;
            b = tmp;

        }
        return a;
    }
}
