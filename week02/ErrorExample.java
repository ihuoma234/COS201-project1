/*
 * COS 201 - Computer Programming I
 * Week 2 Practical: ErrorExample.java
 *
 * Student   : Ogbogu Ihuoma Frances
 * Matric No : 25/18081
 * Programme : Computer Science
 *
 * Purpose: This is the CORRECTED version of a program that had four
 * compile-time errors. The original, broken program was:
 *
 *     public class errorExample {
 *         public static void main(String[] args) {
 *             System.out.println("Welcome to COS 201")
 *             system.out.println("Java is case-sensitive.");
 *             System.out.println("Every statement ends with a semicolon.);
 *         }
 *     }
 *
 * The first compile reported only the two syntax errors, because javac
 * stops checking before it reaches the others. After I fixed those, the
 * second compile reported the other two. These are the exact messages
 * javac printed and how I fixed each one:
 *
 * First compile (2 errors):
 *
 * 1. ErrorExample.java:3: error: ';' expected
 *    Cause: the first println statement did not end with a semicolon.
 *    Fix:   added ; at the end of the statement.
 *
 * 2. ErrorExample.java:5: error: unclosed string literal
 *    Cause: the last string was opened with " but never closed.
 *    Fix:   added the closing " before the closing bracket.
 *
 * Second compile (2 errors):
 *
 * 3. ErrorExample.java:1: error: class errorExample is public, should be
 *    declared in a file named errorExample.java
 *    Cause: a public class must have exactly the same name as its file,
 *    including capital letters.
 *    Fix:   renamed the class from errorExample to ErrorExample.
 *
 * 4. ErrorExample.java:4: error: package system does not exist
 *    Cause: Java is case-sensitive, so "system" is not the same as
 *    "System".
 *    Fix:   changed system.out.println to System.out.println.
 *
 * Third compile: no errors, and the program runs correctly.
 */
public class ErrorExample {

    public static void main(String[] args) {
        System.out.println("Welcome to COS 201");
        System.out.println("Java is case-sensitive.");
        System.out.println("Every statement ends with a semicolon.");
    }
}
