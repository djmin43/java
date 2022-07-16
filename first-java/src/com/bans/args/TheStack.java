package com.bans.args;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStack(int size){
        stackSize = size;
        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");
    }


    public void push(String input){
        if(topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("sorry but stack is full");
    }

    public static void main(String[] args) {

    }
}
