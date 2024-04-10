package org.example.calc;



import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    @Test
    public void addTest(){
        myCalc = new Calculator();
        assertEquals(40,myCalc.add(20,20));
    }

    public void multiplyTest(){
        myCalc = new Calculator();
        assertEquals(400,myCalc.add(20,20));
    }

    public void subtractTest(){
        myCalc = new Calculator();
        assertEquals(10,myCalc.add(20,10));
    }

}