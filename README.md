# COS 201 — Computer Programming I

Java practical work for COS 201, Weeks 1 to 3.

| | |
|---|---|
| **Student name** | Ogbogu Ihuoma Frances |
| **Matriculation number** | 25/18081 |
| **Programme** | Computer Science |
| **Course** | COS 201 — Computer Programming I |
| **Language** | Java (JDK 8 or later) |

## Repository structure

```
COS201-project1/
├── README.md
├── .gitignore
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

## Requirements

You need the Java Development Kit (JDK), version 8 or later. Check that it is installed:

```bash
java -version
javac -version
```

## How to compile and run any program

The commands are the same on Windows (Command Prompt or PowerShell), macOS and Linux.

1. Open a terminal in the folder that holds the program, for example `cd week03`.
2. Compile the source file. This creates a `.class` file:
   ```bash
   javac SimpleCalculator.java
   ```
3. Run the class. Type the class name only, without `.java` or `.class`:
   ```bash
   java SimpleCalculator
   ```

`.class` files are listed in `.gitignore`, so only the source code is stored in the repository.

---

## Week 1 — Introduction to Programming

| Program | What it does |
|---|---|
| `FirstProgram.java` | Prints a welcome message, which shows the JDK is installed and working. |

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

Output:

```
Hello, COS 201!
My name is Ogbogu Ihuoma Frances.
This is my first Java program.
```

> **Note:** Week 1 Activities A, B and C are handwritten on paper, as the course notes require, so they are not in this repository.

---

## Week 2 — Development Environment and First Java Program

| Program | What it does |
|---|---|
| `HelloWorld.java` | The traditional first program: prints `Hello, World!`. |
| `StudentProfile.java` | Prints my student profile, one detail per line. |
| `PrintExample.java` | Shows the difference between `print()` and `println()`, and the escape sequences `\t`, `\n`, `\"` and `\\`. |
| `ErrorExample.java` | The corrected version of a program that had four compile-time errors. Its comments show the broken code, the exact `javac` error messages and how each was fixed. |

```bash
cd week02
javac HelloWorld.java StudentProfile.java PrintExample.java ErrorExample.java
java HelloWorld
java StudentProfile
java PrintExample
java ErrorExample
```

Output of `java StudentProfile`:

```
=======================================
            STUDENT PROFILE
=======================================
Name       : Ogbogu Ihuoma Frances
Matric No  : 25/18081
Programme  : Computer Science
Course     : COS 201 - Computer Programming I
Language   : Java
=======================================
```

Output of `java PrintExample`:

```
Java is fun!

Escape sequences:
Name:	Ogbogu Ihuoma Frances
First line
Second line
My lecturer said "Practise daily."
Saved in C:\COS201\week02
```

### Errors fixed in `ErrorExample.java`

| # | Error message from `javac` | Cause | Fix |
|---|---|---|---|
| 1 | `';' expected` | A statement did not end with a semicolon. | Added `;` |
| 2 | `unclosed string literal` | A string was opened with `"` but never closed. | Added the closing `"` |
| 3 | `class errorExample is public, should be declared in a file named errorExample.java` | The class name did not match the file name `ErrorExample.java`. | Renamed the class to `ErrorExample` |
| 4 | `package system does not exist` | Java is case-sensitive: `system` is not `System`. | Changed to `System.out.println` |

Errors 1 and 2 were reported on the first compile. Errors 3 and 4 appeared on the second compile, after the first two were fixed. The third compile succeeded.

---

## Week 3 — Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and use variables of type `int`, `double` and `String`.
- Declare constants with `final`.
- Write arithmetic expressions with `+`, `-`, `*`, `/` and `%`.
- Read keyboard input with the `Scanner` class (`nextLine()`, `nextInt()`, `nextDouble()`).
- Display formatted output with `printf` (`%.2f` for two decimal places, `%,.2f` to add thousands separators).
- Validate input so that the programs give clear messages instead of wrong answers or crashes.

### Programs

| Program | Input | Output |
|---|---|---|
| `SimpleCalculator.java` | Two numbers | Sum, difference, product, quotient and remainder. Division by zero is checked before dividing. |
| `AverageCalculator.java` | Student name and three course scores | Total and average score. Scores below 0 or above 100 are rejected (extension exercise). |
| `ItemCost.java` | Item name, quantity, then unit price | A purchase summary with the total cost in Naira (NGN). A quantity below 1 or a negative price is rejected. |

All three programs print a clear message if a number is expected and something else is typed (for example `abc`).

### How to compile and run

```bash
cd week03
javac SimpleCalculator.java AverageCalculator.java ItemCost.java
java SimpleCalculator
java AverageCalculator
java ItemCost
```

### Sample runs

**SimpleCalculator** — normal input:

```
> java SimpleCalculator
=== SIMPLE CALCULATOR ===
Enter the first number: 20
Enter the second number: 6

----------- RESULTS -----------
Sum        : 26.00
Difference : 14.00
Product    : 120.00
Quotient   : 3.33
Remainder  : 2.00
-------------------------------
```

**SimpleCalculator** — second number is zero:

```
> java SimpleCalculator
=== SIMPLE CALCULATOR ===
Enter the first number: 15
Enter the second number: 0

----------- RESULTS -----------
Sum        : 15.00
Difference : 15.00
Product    : 0.00
Quotient   : cannot divide by zero
Remainder  : cannot divide by zero
-------------------------------
```

**AverageCalculator** — normal input:

```
> java AverageCalculator
=== STUDENT AVERAGE CALCULATOR ===
Enter student name: Ogbogu Ihuoma Frances
Enter score for course 1 (0-100): 70
Enter score for course 2 (0-100): 85
Enter score for course 3 (0-100): 90

---------- RESULT SUMMARY ----------
Student Name  : Ogbogu Ihuoma Frances
Course 1 Score: 70.00
Course 2 Score: 85.00
Course 3 Score: 90.00
Total Score   : 245.00
Average Score : 81.67
------------------------------------
```

**AverageCalculator** — score out of range:

```
> java AverageCalculator
=== STUDENT AVERAGE CALCULATOR ===
Enter student name: Ogbogu Ihuoma Frances
Enter score for course 1 (0-100): 70
Enter score for course 2 (0-100): 105
Invalid score: each score must be between 0 and 100.
```

**ItemCost** — normal input:

```
> java ItemCost
=== ITEM COST CALCULATOR ===
Enter item name: Exercise Book
Enter quantity: 12
Enter unit price (NGN): 350

========= PURCHASE SUMMARY =========
Item        : Exercise Book
Quantity    : 12
Unit Price  : NGN 350.00
Total Cost  : NGN 4,200.00
====================================
```

**ItemCost** — invalid quantity:

```
> java ItemCost
=== ITEM COST CALCULATOR ===
Enter item name: Exercise Book
Enter quantity: 0
Invalid quantity: quantity must be at least 1.
```

### Testing

Each program was tested with normal, boundary and invalid inputs. All 26 tests passed.

**SimpleCalculator**

| Test | Input | Expected result | Result |
|---|---|---|---|
| Whole numbers | 20, 6 | Sum 26.00, Difference 14.00, Product 120.00, Quotient 3.33, Remainder 2.00 | Pass |
| Decimals | 7.5, 2.5 | Sum 10.00, Difference 5.00, Product 18.75, Quotient 3.00, Remainder 0.00 | Pass |
| Divide by zero | 15, 0 | Quotient and remainder: "cannot divide by zero" | Pass |
| Negative number | -8, 4 | Sum -4.00, Difference -12.00, Product -32.00, Quotient -2.00, Remainder 0.00 | Pass |
| Zero and negative | 0, -5 | Product 0.00, Quotient 0.00 (not -0.00) | Pass |
| First input not a number | abc | "Invalid input: please enter a number." | Pass |
| Second input not a number | 5, xyz | "Invalid input: please enter a number." | Pass |
| No input | (none) | "Invalid input: please enter a number." | Pass |

**AverageCalculator**

| Test | Input | Expected result | Result |
|---|---|---|---|
| Normal scores | 70, 85, 90 | Total 245.00, Average 81.67 | Pass |
| Lowest boundary | 0, 0, 0 | Total 0.00, Average 0.00 | Pass |
| Highest boundary | 100, 100, 100 | Total 300.00, Average 100.00 | Pass |
| Decimal scores | 65.5, 72.5, 80 | Total 218.00, Average 72.67 | Pass |
| Score above 100 | 70, 101 | "Invalid score: each score must be between 0 and 100." | Pass |
| Negative score | -5 | "Invalid score: each score must be between 0 and 100." | Pass |
| Score not a number | 70, seventy | "Invalid input: score must be a number." | Pass |
| Empty name | (blank) | "Invalid input: student name cannot be empty." | Pass |

**ItemCost**

| Test | Input | Expected result | Result |
|---|---|---|---|
| Normal purchase | Exercise Book, 12, 350 | Total Cost NGN 4,200.00 | Pass |
| Decimal price | Biro, 3, 1250.50 | Total Cost NGN 3,751.50 | Pass |
| Smallest quantity, free item | Free Flyer, 1, 0 | Total Cost NGN 0.00 | Pass |
| Large total | Textbook, 250, 15000 | Total Cost NGN 3,750,000.00 | Pass |
| Quantity zero | Pen, 0 | "Invalid quantity: quantity must be at least 1." | Pass |
| Negative quantity | Pen, -3 | "Invalid quantity: quantity must be at least 1." | Pass |
| Decimal quantity | Pen, 2.5 | "Invalid input: quantity must be a whole number." | Pass |
| Negative price | Pen, 2, -50 | "Invalid price: unit price cannot be negative." | Pass |
| Price not a number | Pen, 2, fifty | "Invalid input: unit price must be a number." | Pass |
| Empty item name | (blank) | "Invalid input: item name cannot be empty." | Pass |

All programs compile with no errors or warnings (`javac -Xlint:all`), on both a current JDK and with `--release 8` for older lab computers.

---

## Git commands used

```bash
git add .
git commit -m "Complete Week 3 variables and input-output practicals"
git push
```

## Author

**Ogbogu Ihuoma Frances** — 25/18081 — Computer Science
