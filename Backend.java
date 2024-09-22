package com.example.calculatorappjavafx;

/**
 * The backend for a calculator app that performs the calculations.
 */
public class Backend implements BackendInterface{

    /**
     * Called from the frontend. Determines which operation method to proceed with and calculates an answer.
     *
     * @param num1     - the first number input by the user.
     * @param operator - the operator input by the user.
     * @param num2     - the second number input by the user.
     * @return double - a double object of the calculation result.
     */
    @Override
    public String calculate(double num1, String operator, double num2) {

        double calculation;
        String result;

        // Perform calculation depending on operator
        if (operator.equals("+")) {
            calculation = num1 + num2;
        } else if (operator.equals("-")) {
            calculation = num1 - num2;
        } else if (operator.equals("*")) {
            calculation = num1 * num2;
        } else if (operator.equals("/")) {
            calculation = num1 / num2;
        } else {
            calculation = num1 % num2;
        }

        result = String.valueOf(calculation);

        // Remove trailing zeros if the result can be expressed as an int
        result = result.contains(".") ? result.replaceAll("0*$", "").replaceAll("\\.$", "") : result;

        return result;
    }

}
