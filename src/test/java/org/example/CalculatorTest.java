package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddTwoNumbers1() {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(3,7);
        assertEquals(10, result);  // 3+7=10
    }

    @Test
    public void testAddTwoNumbers2() {
        Calculator calculator = new Calculator() ;
        int result = calculator.addTwoNumbers(10,10);
        assertEquals(20, result); // 10+10=20
    }

    @Test
    public void testAddTwoNumbers3() {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(10, 15); // 10+15=25
        assertEquals(25, result);
    }


    @Test
    public void testSubtractTwoNumbers1() {
        Calculator calculator = new Calculator();
        int result = calculator.subtractTwoNumbers(10, 5);
        assertEquals(5, result);  // 10-5=5
    }

    @Test
    public void testSubtractTwoNumbers2() {
        Calculator calculator = new Calculator();
        int result = calculator.subtractTwoNumbers(15, 20);
        assertEquals(-5, result);  // 15-20=-5
    }


    @Test
    public void testMultiplyTwoNumbers1() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplyTwoNumbers(2, 5);
        assertEquals(10, result);  // 2*5=10
    }

    @Test
    public void testMultiplyTwoNumbers2() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplyTwoNumbers(7, 3);
        assertEquals(21, result);  // 7*3=21
    }

    @Test
    public void testMultiplyTwoNumbers3() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplyTwoNumbers(0, 10);
        assertEquals(0, result);  // 0*10=0
    }

    @Test
    public void testDivideTwoNumbers1() {
        Calculator calculator = new Calculator();
        int result = calculator.divideTwoNumbers(20, 4);
        assertEquals(5, result);  // 20/4=5
    }

    @Test
    public void testDivideTwoNumbers2() {
        Calculator calculator = new Calculator();
        int result = calculator.divideTwoNumbers(15, 3);
        assertEquals(5, result);  // 15/3=5
    }

}