package com.view;

public interface DisplayInterface {
    int getSizeOfArray();
    String getSortingChoice();
    void displaySortingAlgorithms();
    void displayArray(int[] array);
    boolean runIterations(String choice);
    String continuationChoice();
}
