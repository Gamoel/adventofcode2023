package com.github.gamoel.adventofcode2023.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private static int extractNumber(String string) {
        return Integer.parseInt(string);
    }

    @Test
    public void simpleNumber() {
        String string = "13";
        int returnValue = extractNumber(string);
        assertEquals(13, returnValue);
    }

    @Test
    public void complexNumber() {
        String string = "123";
        int returnValue = extractNumber(string);
        assertEquals(13, returnValue);
    }


}