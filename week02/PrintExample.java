/*
 * COS 201 - Computer Programming I
 * Week 2 Practical: PrintExample.java
 *
 * Student   : Ogbogu Ihuoma Frances
 * Matric No : 25/18081
 * Programme : Computer Science
 *
 * Purpose: Shows the difference between System.out.print() and
 * System.out.println(), and how escape sequences work inside strings.
 */
public class PrintExample {

    public static void main(String[] args) {
        // print() writes the text and leaves the cursor on the SAME line.
        System.out.print("Java ");
        System.out.print("is ");
        // println() writes the text and then moves to a NEW line.
        System.out.println("fun!");

        // println() with nothing inside it prints a blank line.
        System.out.println();

        System.out.println("Escape sequences:");
        System.out.println("Name:\tOgbogu Ihuoma Frances");          // \t  inserts a tab
        System.out.println("First line\nSecond line");               // \n  starts a new line
        System.out.println("My lecturer said \"Practise daily.\"");  // \"  prints a double quote
        System.out.println("Saved in C:\\COS201\\week02");            // \\  prints a backslash
    }
}
