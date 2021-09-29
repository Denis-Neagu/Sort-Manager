package com.view;

import com.controller.ObjectFactory;
import com.controller.ValidInput;
import com.model.RandomArray;
import com.model.Sort;

public class SortManager {
    static Display display = new Display();
    static ValidInput validInput = new ValidInput();
    static RandomArray randomArray = new RandomArray();

    public static void main(String[] args) {
        SortManager sortManager = new SortManager();
        sortManager.controller();
    }

    public void controller() {
        System.out.println("Input size of array between 3 and 50: ");
        int userArraySizeInput = display.getSizeOfArray();
        boolean userArraySizeInputValid = validInput.checkUserInput(userArraySizeInput);

        if (userArraySizeInputValid) {
            int[] array = randomArray.randomArray(userArraySizeInput);
            System.out.println("Unsorted Array:");
            display.displayArray(array);

            System.out.println("\nWhat sorting method would you like to implement to sort this array of ints?");
            display.displaySortingAlgorithms();
            String choice = display.getSortingChoice();

            Sort sort = (Sort) ObjectFactory.getInstance(choice);
            if (sort != null) {
                sort.sort(array);
                System.out.println("Sorted Array:");
                display.displayArray(array);
            } else {
                System.out.println("You didn't input a correct input for sorting method");
            }
        }
    }
}
