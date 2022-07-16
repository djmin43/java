package com.bans.args;

public class ArrayStructures {

    private final int[] theArray = new int[50];

    private final int arraySize = 10;

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

    public int getValueAtIndex (int index) {
        if (index < arraySize) return this.theArray[index];

        return 0;
    }

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();

        int value = newArray.getValueAtIndex(5);
        System.out.println(value);

    }
}
