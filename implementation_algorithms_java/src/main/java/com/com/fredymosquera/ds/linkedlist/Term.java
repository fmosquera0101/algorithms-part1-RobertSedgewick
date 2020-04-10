package com.com.fredymosquera.ds.linkedlist;

public class Term {

    private Term nex;
    private int c;
    private String inc;
    private int j;

    public Term(int c, String inc, int j) {
        this.c = c;
        this.inc = inc;
        this.j = j;
    }
    public Term(int c, String inc) {
        this(c);
        this.inc = inc;


    }
    public Term(String inc) {
        this.c = 1;
        this.inc = inc;
        this.j = 1;


    }

    public Term(int c) {
        this.c = c;
        this.j = 1;
    }


    public Term(String inc, int j) {
        this.c = 1;
        this.inc = inc;
        this.j = j;
    }

    public Term getNex() {
        return nex;
    }

    public void setNex(Term nex) {
        this.nex = nex;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
