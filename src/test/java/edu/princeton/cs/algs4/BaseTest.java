package edu.princeton.cs.algs4;

import java.util.Random;

public class BaseTest {

    public Integer[] newIntegerArray(int size, int maxVal){
        Random r = new Random();
        Integer[] intArray = new Integer[size];
        for(int i = 0; i < intArray.length; ++i ) {
            intArray[i] = r.nextInt(maxVal);
        }
        return intArray;
    }

    public static void display(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
