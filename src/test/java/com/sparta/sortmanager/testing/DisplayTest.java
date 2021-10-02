package com.sparta.sortmanager.testing;

import com.view.Display;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  DisplayTest {
    Display display;

    @BeforeEach
    public void setUp()  {
        display = new Display();
    }

    @Test
    public void runIterations_WithUpperCase() {
        boolean inputY = display.runIterations("N");
        boolean inputN = display.runIterations("Y");

        assertEquals(true, inputY );
        assertEquals(true, inputN );
    }

    @Test
    public void runIterations_WithLowerCase() {
        boolean inputSmallY = display.runIterations("y");
        boolean inputSmallN = display.runIterations("n");

        assertEquals(true, inputSmallY );
        assertEquals(true, inputSmallN );
    }

    @Test
    public void runIterations_WithInvalidInput() {
        boolean otherInput = display.runIterations("q");

        assertEquals(false, otherInput );
    }
}
