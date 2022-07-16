package com.bans.args;

public class ArrayStructures {

    private final int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("-----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("-----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) return this.theArray[index];

        return 0;
    }

    public boolean doesArrayContainThisValue(int value) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public void linearSearchForValue(int value){
        for (int i = 0; i < arraySize; i++){
            if (theArray[i] == value) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();

        newArray.deleteIndex(4);

        newArray.insertValue(199);

        newArray.linearSearchForValue(11);
    }
}
