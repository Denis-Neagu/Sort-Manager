package com.sparta.sortmanager.testing;

import com.view.Display;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class  DisplayTest {

    @Test
    public void runIterationsWithoutCaseSensitivity() {
        Display display = new Display();

        boolean inputY = display.runIterations("N");
        boolean inputN = display.runIterations("Y");

        assertEquals(true, inputY );
        assertEquals(true, inputN );
    }

    @Test
    public void runIterationTestWithCaseSensitive() {
        Display display = new Display();

        boolean inputSmallY = display.runIterations("y");
        boolean inputSmallN = display.runIterations("n");

        assertEquals(true, inputSmallY );
        assertEquals(true, inputSmallN );
    }

    @Test
    public void runIterationsWithInvalidInput() {
        Display display = new Display();

        boolean otherInput = display.runIterations("q");

        assertEquals(false, otherInput );
    }
}
