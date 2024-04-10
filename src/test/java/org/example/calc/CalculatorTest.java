package org.example.calc;


import ie.atu.calc.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    @Test
    public void addTest(){
        myCalc = new Calculator();
        assertEquals(40,myCalc.add(20,20));
    }
}