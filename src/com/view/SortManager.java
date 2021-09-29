package com.view;

public class SortManager {
    static Display display = new Display();

    public static void main(String[] args) {
        System.out.println("Input size of array between 3 and 50: ");
        int userArraySizeInput = display.getSizeOfArray();
        boolean userArraySizeInputValid = checkUserInput(userArraySizeInput);

        if(userArraySizeInputValid) {
            System.out.println("What sorting method would you like to implement?");
            display.displaySortingAlgorithms();
            String choice = display.getSortingChoice();

        }

    }

    private static boolean checkUserInput(int userArraySizeInput) {
        if (userArraySizeInput != -1) {
            return true;
        } else {
            return false;
        }
    }
}
