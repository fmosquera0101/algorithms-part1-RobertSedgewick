package com.com.fredymosquera.ds.linkedlist;

public class Node {

    private Node nex;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public Node getNex() {
        return nex;
    }

    public void setNex(Node nex) {
        this.nex = nex;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
