package com.com.fredymosquera.part1;

public class CircularStringRotation {

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        System.out.println(isCircularShifted(s, t));
    }
    public static boolean isCircularShifted(String s, String t){

        if(s.equals(t)){
            return true;
        }

        if(s.length() == t.length()){
            int idx = -1;
            for (int i = 0; i < s.length() ; i++) {
               if(t.charAt(0) == s.charAt(i)){
                   idx = i;
                   break;
               }


            }
            if(idx != -1){
                String leftSubS = s.substring(0, idx);
                String rightsubS = s.substring(idx+1);
                String rightsubT = t.substring(1, t.length() - leftSubS.length());
                String leftSubT = t.substring(rightsubS.length()+1);
                if(rightsubS.equals(rightsubT) && leftSubS.equals(leftSubT)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
