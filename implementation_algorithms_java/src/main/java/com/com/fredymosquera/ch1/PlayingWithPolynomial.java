package com.com.fredymosquera.ch1;

import com.com.fredymosquera.ds.linkedlist.Polynomial;
import com.com.fredymosquera.ds.linkedlist.Term;

public class PlayingWithPolynomial {


    public static void main(String[] args) {
        Polynomial p = new Polynomial();
        Polynomial q = new Polynomial();
        p.set(1);
        p.set(2, "x");
        p.set(-3, "x", 2);

        q.set(2);
        q.set(-1, "x");

      //  printPoly(p);
        System.out.println();
        printPoly(add(p, q));
    }

    private static void printPoly(Polynomial p) {
        Term p0 = p.getHead();
        StringBuilder termCom = new StringBuilder();
        while (p0 != null){
            StringBuilder term = new StringBuilder();
            if(p0.getC() != 1){
                term.append(p0.getC());
            }
            if(p0.getInc() != null){
                term.append(p0.getInc());
            }
            if(p0.getJ() != 0 && p0.getJ() != 1){
                term.append("^").append(+p0.getJ());
            }
            term.append(" + ");

            termCom.append(term);
            p0 = p0.getNex();
        }

        System.out.printf("%s", termCom.toString().substring(0, termCom.length() - 2));
    }

    private static Polynomial add(Polynomial p, Polynomial q){
        Polynomial r = new Polynomial();
        Term p0 = p.getHead();

        while (p0 != null){
            Term q0 = q.getHead();
            boolean termUnique = true;
            while (q0 != null){
                int c = q0.getC();
                String x = q0.getInc();
                int j = q0.getJ();
                if(x == p0.getInc() && j == p0.getJ()){
                    c += p0.getC();
                    r.set(c, x, j);
                    termUnique  = false;
                }

                q0 = q0.getNex();
            }
            if(termUnique){
                r.set(p0.getC(), p0.getInc(), p0.getJ());
            }
            p0 = p0.getNex();
        }

        return  r;
    }
}
