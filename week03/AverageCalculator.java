import java.util.Scanner;

/*
 * COS 201 - Computer Programming I
 * Week 3 Practical: AverageCalculator.java
 *
 * Student   : Ogbogu Ihuoma Frances
 * Matric No : 25/18081
 * Programme : Computer Science
 *
 * Purpose: Reads a student's name and three course scores, then
 * displays the total and the average score.
 *
 * Week 3 concepts used:
 *   - String and double variables
 *   - constants declared with final
 *   - expressions: total = score1 + score2 + score3, average = total / 3
 *   - Scanner input: nextLine() for text, nextDouble() for numbers
 *   - formatted output with printf
 *
 * Extension: each score must be between 0 and 100. Any score outside
 * that range, or any input that is not a number, is rejected with a
 * clear message instead of giving a wrong average.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        final double MIN_SCORE = 0;
        final double MAX_SCORE = 100;
        final int NUMBER_OF_COURSES = 3;

        Scanner input = new Scanner(System.in);

        System.out.println("=== STUDENT AVERAGE CALCULATOR ===");

        // Read the student's name (nextLine allows spaces in the name)
        System.out.print("Enter student name: ");
        String studentName = input.hasNextLine() ? input.nextLine().trim() : "";
        if (studentName.isEmpty()) {
            System.out.println("Invalid input: student name cannot be empty.");
            input.close();
            return;
        }

        // Score for course 1
        System.out.print("Enter score for course 1 (0-100): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: score must be a number.");
            input.close();
            return;
        }
        double score1 = input.nextDouble();
        if (score1 < MIN_SCORE || score1 > MAX_SCORE) {
            System.out.println("Invalid score: each score must be between 0 and 100.");
            input.close();
            return;
        }

        // Score for course 2
        System.out.print("Enter score for course 2 (0-100): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: score must be a number.");
            input.close();
            return;
        }
        double score2 = input.nextDouble();
        if (score2 < MIN_SCORE || score2 > MAX_SCORE) {
            System.out.println("Invalid score: each score must be between 0 and 100.");
            input.close();
            return;
        }

        // Score for course 3
        System.out.print("Enter score for course 3 (0-100): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: score must be a number.");
            input.close();
            return;
        }
        double score3 = input.nextDouble();
        if (score3 < MIN_SCORE || score3 > MAX_SCORE) {
            System.out.println("Invalid score: each score must be between 0 and 100.");
            input.close();
            return;
        }

        // Calculations
        double total = score1 + score2 + score3;
        double average = total / NUMBER_OF_COURSES;

        // Output
        System.out.println();
        System.out.println("---------- RESULT SUMMARY ----------");
        System.out.println("Student Name  : " + studentName);
        System.out.printf("Course 1 Score: %.2f%n", score1);
        System.out.printf("Course 2 Score: %.2f%n", score2);
        System.out.printf("Course 3 Score: %.2f%n", score3);
        System.out.printf("Total Score   : %.2f%n", total);
        System.out.printf("Average Score : %.2f%n", average);
        System.out.println("------------------------------------");

        input.close();
    }
}
