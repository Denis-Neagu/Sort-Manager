package com.controller;

public class ValidInput implements ValidInputInterface{
    @Override
    public boolean checkUserInput(int userArraySizeInput) {
        if (userArraySizeInput != -1) {
            return true;
        } else {
            return false;
        }
    }
}
