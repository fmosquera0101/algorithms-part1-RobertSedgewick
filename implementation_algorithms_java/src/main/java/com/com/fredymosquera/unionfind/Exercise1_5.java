package com.com.fredymosquera.unionfind;

import edu.princeton.cs.algs4.QuickUnionUF;

import java.util.Arrays;

public class Exercise1_5 {

    public static void main(String[] args) {

        UnionFind unionFind = new UnionFind(10);
        unionFind.union(9, 0);
        unionFind.union(3, 4);
        unionFind.union(5, 8);
        unionFind.union(7, 2);
        unionFind.union(2, 1);
        unionFind.union(5, 7);
        unionFind.union(0, 3);
        unionFind.union(4, 2);

        int[] id =  unionFind.getId();
        System.out.println(Arrays.toString(id));

        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" -> "+i+", ");
        }
        System.out.println();

        QuickUnionUF quickUnionUF = new QuickUnionUF(10);
        quickUnionUF.union(9, 0);
        quickUnionUF.union(3, 4);
        quickUnionUF.union(5, 8);
        quickUnionUF.union(7, 2);
        quickUnionUF.union(2, 1);
        quickUnionUF.union(5, 7);
        quickUnionUF.union(0, 3);
        quickUnionUF.union(4, 2);

        for (int i = 0; i < 10; i++) {
            System.out.println(quickUnionUF.find(i));
        }
    }
}
