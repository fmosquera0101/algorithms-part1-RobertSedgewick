package com.com.fredymosquera.ds.linkedlist;

public class Polynomial {

    public static class Builder{
        Term head;
        public Builder set(Term term){
            this.head = term;
            return this;
        }

        public Builder set(int c, String inc, int j){
            if(head == null){
                head = new Term(c, inc, j);
                return this;
            }
            Term currTerm = head;
            while (currTerm.getNex() != null){
                currTerm = currTerm.getNex();
            }
            currTerm.setNex(new Term(c, inc, j));
            return this;
        }

        public Builder set(int c, String inc){
            if(head == null){
                head = new Term(c, inc);
                return this;
            }
            Term currTerm = head;
            while (currTerm.getNex() != null){
                currTerm = currTerm.getNex();
            }
            currTerm.setNex(new Term(c, inc));

            return this;
        }

        public Builder set(String inc, int j){
            if(head == null){
                head = new Term(inc, j);
                return this;
            }
            Term currTerm = head;
            while (currTerm.getNex() != null){
                currTerm = currTerm.getNex();
            }
            currTerm.setNex(new Term(inc, j));
            return this;
        }

        public Builder set(int c){
            if(head == null){
                head = new Term(c);
                return this;
            }
            Term currTerm = head;
            while (currTerm.getNex() != null){
                currTerm = currTerm.getNex();
            }
            currTerm.setNex(new Term(c));
            return this;
        }
        public Builder set(String inc){
            if(head == null){
                head = new Term(inc);
                return this;
            }
            Term currTerm = head;
            while (currTerm.getNex() != null){
                currTerm = currTerm.getNex();
            }
            currTerm.setNex(new Term(inc));
            return this;
        }

        public Polynomial build(){
            return new Polynomial(this);
        }

    }

    private Term head;
    public Polynomial(Builder builder){
        this.head = builder.head;
    }
    public Term getHead() {
        return head;
    }
}
