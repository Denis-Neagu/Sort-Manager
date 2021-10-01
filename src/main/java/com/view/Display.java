package com.view;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display implements DisplayInterface{
    Scanner scan = new Scanner(System.in);

    @Override
    public int getSizeOfArray() {
        try {
            int size = scan.nextInt();
            if (size >=3 && size <= 50) {
                return size;
            } else {
                throw new InputMismatchException("ERROR. You did not input a number a number from 3-50\nGoodbye!");
            }
        } catch (InputMismatchException e) {
            if(e.getMessage() == null) {
                System.out.println("ERROR. You did not input a number\nGoodbye!");
            } else {
                System.out.println(e.getMessage());
            }
            System.exit(1);
        }
        return -1;
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

    @Override
    public boolean runIterations(String choice){
        if (choice.equalsIgnoreCase("Y")) {
            return true;
        } else if (choice.equalsIgnoreCase("N")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String continuationChoice() {
        try {
            System.out.println("Would you like to Continue? \n Y = Yes, N = No");
            String choice = scan.next();
            if (!runIterations(choice)) {
                throw new InputMismatchException("ERROR. Input was not Yes or No.\nGoodbye!");
            }
            return choice;
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return null;
    }
}