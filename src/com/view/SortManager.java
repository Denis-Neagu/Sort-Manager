package com.view;

public class SortManager {
    static Display display = new Display();

    public static void main(String[] args) {
        System.out.println("Input size of array between 3 and 50: ");

        int x = display.getSizeOfArray();

        System.out.println("What sorting method would you like to implement?");
        display.displaySortingAlgorithms();

        String choice = display.getSortingChoice();

    }

}
