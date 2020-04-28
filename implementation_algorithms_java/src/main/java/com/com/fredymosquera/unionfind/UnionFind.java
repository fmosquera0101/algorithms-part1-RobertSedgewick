package com.com.fredymosquera.unionfind;

public class UnionFind {
    private int count;
    private int [] id;

    public UnionFind(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < id.length ; i++) {
            id[i] = i;
        }
    }

    public int getCount(){
        return count;
    }

    public int find(int p){
        return id[p];
    }

    public int[] getId() {
        return id;
    }

    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];
        if(pId != qId){
            for (int i = 0; i < id.length ; i++) {
                if(id[i] == pId){
                       id[i] = qId;
                 }
            }
        }
    }
}
