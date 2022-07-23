package com.java.OOPClass;

public class JavaLessonNine {

    public static void main(String[] args) {
       int[] randomArray;
       int[] numberArray = new int[10];

       randomArray = new int[20];
       randomArray[1] = 2;
       String[] stringArray = {"just", "random", "words"};



        for(int i = 0; i < numberArray.length; i ++) {
           numberArray[i] = i;
        }

        int k = 1;
        while (k <=41){
            k++;
        }

        for(int j = 0; j < numberArray.length; j ++) {
        }

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i ++) {
           for(int j = 0; j < multiArray[i].length; j++) {
               multiArray[i][j] = i + " " + j;
           }
        }

        for(int row : numberArray) {
            System.out.println(row);
        }




    }
}
