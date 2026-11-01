import java.util.Scanner;

/*
 * COS 201 - Computer Programming I
 * Week 3 Practical: SimpleCalculator.java
 *
 * Student   : Ogbogu Ihuoma Frances
 * Matric No : 25/18081
 * Programme : Computer Science
 *
 * Purpose: Reads two numbers from the keyboard and displays their sum,
 * difference, product, quotient and remainder.
 *
 * Week 3 concepts used:
 *   - variables of type double (numbers that can have decimal places)
 *   - arithmetic operators  +  -  *  /  %
 *   - keyboard input with the Scanner class
 *   - formatted output with printf (%.2f = two decimal places)
 *
 * Division by zero is checked BEFORE dividing, and the program prints a
 * clear message if the user types something that is not a number.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SIMPLE CALCULATOR ===");

        // Read the first number
        System.out.print("Enter the first number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: please enter a number.");
            input.close();
            return;
        }
        double firstNumber = input.nextDouble();

        // Read the second number
        System.out.print("Enter the second number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: please enter a number.");
            input.close();
            return;
        }
        double secondNumber = input.nextDouble();

        // Calculations that are always safe
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // A double can hold "negative zero" (for example 0 * -5). It is equal
        // to 0, so setting it back to 0 stops the program printing -0.00.
        if (product == 0) {
            product = 0;
        }

        System.out.println();
        System.out.println("----------- RESULTS -----------");
        System.out.printf("Sum        : %.2f%n", sum);
        System.out.printf("Difference : %.2f%n", difference);
        System.out.printf("Product    : %.2f%n", product);

        // Dividing by zero has no meaningful answer, so check first.
        if (secondNumber == 0) {
            System.out.println("Quotient   : cannot divide by zero");
            System.out.println("Remainder  : cannot divide by zero");
        } else {
            double quotient = firstNumber / secondNumber;
            double remainder = firstNumber % secondNumber;
            if (quotient == 0) {
                quotient = 0;    // avoid printing -0.00 (for example 0 / -5)
            }
            if (remainder == 0) {
                remainder = 0;   // avoid printing -0.00 (for example -8 % 4)
            }
            System.out.printf("Quotient   : %.2f%n", quotient);
            System.out.printf("Remainder  : %.2f%n", remainder);
        }
        System.out.println("-------------------------------");

        input.close();
    }
}
