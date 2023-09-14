package ch.juventus.javadoc;

import java.util.List;

/**
 * This class provides basic math operations.
 * @version 1.0.0
 */
public class MathUtils
{
    /**
     * Adds the first number to the second number and so on.
     * @param numbers
     * @return
     */
    public double addition (List<Double> numbers)
    {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    /**
     * Subtracts the second number from the first number and so on.
     * @param numbers
     * @return
     */
    public double subtraction (List<Double> numbers)
    {
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    /**
     * Multiplies the first number with the second number and so on.
     * @param numbers
     * @return
     */
    public double multiplication (List<Double> numbers)
    {
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    /**
     * Divides the first number by the second number and so on.
     * @param numbers
     * @throws ArithmeticException if one of the numbers is zero
     * @return
     */
    public double division (List<Double> numbers)
    {
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == 0) throw new ArithmeticException("Division by zero is not allowed");
            result /= numbers.get(i);
        }
        return result;
    }
}
