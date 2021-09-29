package com.view;

import java.util.Scanner;

public class Display implements DisplayInterface{

    @Override
    public int askForSizeArray() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size >=3 && size <= 50) {
            return size;
        } else {
            System.out.println("You need to input a number between 3 and 50");
            return -1;
        }
    }
}
