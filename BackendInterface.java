package com.example.calculatorappjavafx;

/**
 * An interface for the backend of a calculator app.
 */
public interface BackendInterface {

    /**
     * Called from the frontend. Determines which operation method to proceed with.
     * @param num1 - the first number input by the user.
     * @param operator - the operator input by the user.
     * @param num2 - the second number input by the user.
     * @return double - a double object of the calculation result.
     */
    public String calculate(double num1, String operator, double num2);

}
