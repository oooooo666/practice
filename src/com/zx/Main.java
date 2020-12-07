package com.zx;

public class Main {

    public static void main(String[] args) {

    }

    public int jumpStairs(int n){
        if(n < 3)
            return n;
        int[] flag = new int[n];
        flag[0] = 1;
        flag[1] = 1;
        flag[2] = 2;
        for(int i = 3; i <= n; i++){
            flag[i] = 2 * flag[i-1];
        }
        return flag[n];
    }
}
