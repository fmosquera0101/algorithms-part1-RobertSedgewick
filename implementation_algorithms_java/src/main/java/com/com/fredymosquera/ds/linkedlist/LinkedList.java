package com.com.fredymosquera.ds.linkedlist;

public class LinkedList {

    private Node head;

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.getNex() != null){
            current = current.getNex();
        }
        current.setNex(new Node(data));
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.setNex(head);
        head = newHead;
    }

    public void deleteWithValue(int data){
        if (head == null){
            return;
        }
        if(head.getData() == data){
            head = head.getNex();
            return;
        }
        Node current = head;
        while (current.getNex() != null){
            if(current.getData() == data){
                current.setNex(current.getNex().getNex());
            }
            current = current.getNex();
        }
    }

}
