package org.example;


public class Calculator {

    // Metod för att addera två tal
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Metod för att subtrahera två tal
    public int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    // Metod för att multiplicera två tal
    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    // Metod för att dividera två tal
    public int divideTwoNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Kan inte dividera med 0");
        }
        return num1 / num2;
    }
}