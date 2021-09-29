package com.view;

import java.util.Arrays;
import java.util.Scanner;

public class Display implements DisplayInterface{
    Scanner scan = new Scanner(System.in);

    @Override
    public int getSizeOfArray() {
        int size = scan.nextInt();
        if (size >=3 && size <= 50) {
            return size;
        } else {
            System.out.println("You need to input a number between 3 and 50");
            return -1;
        }
    }

    @Override
    public String getSortingChoice(){
        return scan.next();
    }

    @Override
    public void displaySortingAlgorithms() {
        System.out.println("B for Bubble Sort");
        System.out.println("M for Merge Sort");
        System.out.println("Q for Quick Sort");
    }

    @Override
    public void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
