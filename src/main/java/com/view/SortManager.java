package com.view;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.controller.ObjectFactory;
import com.controller.ValidInput;
import com.model.RandomArray;
import com.model.Sort;

public class SortManager {
    static Display display = new Display();
    static ValidInput validInput = new ValidInput();
    static RandomArray randomArray = new RandomArray();
    private static Logger log = Logger.getLogger("SortManagerLogger");

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        SortManager sortManager = new SortManager();
        boolean userContinuation = false;
        int prevSize = 0;
        int userArraySizeInput = 0;
        int[] array = null;
        int[] oldArray = null;

        do {
            System.out.println("Input size of array between 3 and 50: ");
            userArraySizeInput = display.getSizeOfArray();
            if (prevSize != userArraySizeInput) {
                array = randomArray.randomArray(userArraySizeInput);
                oldArray = array.clone();
            } else {
                array = oldArray;
                int[] newArr = array.clone();
                array = newArr;
            }

            sortManager.controller(userArraySizeInput, array);
            prevSize = userArraySizeInput;

            String userChoice = display.continuationChoice();
            if(userChoice.equalsIgnoreCase("Y")) {
                userContinuation=true;
            } else if (userChoice.equalsIgnoreCase("N")) {
                userContinuation=false;
            }
        }
        while (userContinuation);
    }

    public void controller(int userArraySizeInput, int[] array) {
        boolean userArraySizeInputValid = validInput.checkUserInput(userArraySizeInput);
        if (userArraySizeInputValid) {
            System.out.println("Unsorted Array:");
            display.displayArray(array);

            System.out.println("\nWhat sorting method would you like to implement to sort this array of ints?");
            display.displaySortingAlgorithms();
            String choice = display.getSortingChoice();

            Sort sort = ObjectFactory.getInstance(choice);
            if (sort != null) {
                long time1 = System.nanoTime();
                sort.sort(array);
                long time2 = System.nanoTime();
                long timeTook = (time2-time1);

                System.out.println("Sorted Array:");
                display.displayArray(array);
                System.out.println("time taken = " + timeTook + "ns\n");
            } else {
                log.warn("Expected B/b, M/m, Q/q, or S/s, but neither was provided");
                System.out.println("You didn't input a correct input for sorting method. Can we get you to try again?");
            }
        }
    }
}
