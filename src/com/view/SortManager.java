package com.view;

import com.controller.ValidInput;

public class SortManager {
    static Display display = new Display();
    static ValidInput validInput = new ValidInput();

    public static void main(String[] args) {
        System.out.println("Input size of array between 3 and 50: ");
        int userArraySizeInput = display.getSizeOfArray();
        boolean userArraySizeInputValid = validInput.checkUserInput(userArraySizeInput);

        if(userArraySizeInputValid) {
            System.out.println("What sorting method would you like to implement?");
            display.displaySortingAlgorithms();
            String choice = display.getSortingChoice();

        }

    }
}
