package com.example.demo.managers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.managers.TestMathManager;

class TestMathManager {

    @Test
    void callingSumPassingTwoInts_ReturnsSum()
    {
        MathManager mathManager = new MathManager();
        assertEquals(5, mathManager.add(2, 3));
    }

}
