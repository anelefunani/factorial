package com.britehouse.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anele on 9/6/2016.
 */
public class FactorialTest {
    @Test
    public void shouldCalcutaleFactorialOfZero(){
        assertEquals(1,Factorial.factorial(0));
    }

    public void shouldCalculateFactorialOfOne(){
        assertEquals(1, Factorial.factorial(1));
    }
}
