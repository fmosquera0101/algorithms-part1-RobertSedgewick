package com.com.fredymosquera.ds.linkedlist;

public class Polynomial {

    private Term head;

    public void set(int c, String inc, int j){
        if(head == null){
            head = new Term(c, inc, j);
            return;
        }
        Term currTerm = head;
        while (currTerm.getNex() != null){
            currTerm = currTerm.getNex();
        }
        currTerm.setNex(new Term(c, inc, j));
    }

    public void set(int c, String inc){
        if(head == null){
            head = new Term(c, inc);
            return;
        }
        Term currTerm = head;
        while (currTerm.getNex() != null){
            currTerm = currTerm.getNex();
        }
        currTerm.setNex(new Term(c, inc));
    }

    public void set(String inc, int j){
        if(head == null){
            head = new Term(inc, j);
            return;
        }
        Term currTerm = head;
        while (currTerm.getNex() != null){
            currTerm = currTerm.getNex();
        }
        currTerm.setNex(new Term(inc, j));
    }

    public void set(int c){
        if(head == null){
            head = new Term(c);
            return;
        }
        Term currTerm = head;
        while (currTerm.getNex() != null){
            currTerm = currTerm.getNex();
        }
        currTerm.setNex(new Term(c));
    }
    public void set(String inc){
        if(head == null){
            head = new Term(inc);
            return;
        }
        Term currTerm = head;
        while (currTerm.getNex() != null){
            currTerm = currTerm.getNex();
        }
        currTerm.setNex(new Term(inc));
    }

    public Term getHead() {
        return head;
    }
}
