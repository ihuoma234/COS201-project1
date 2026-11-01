import java.util.Scanner;

/*
 * COS 201 - Computer Programming I
 * Week 3 Practical: ItemCost.java
 *
 * Student   : Ogbogu Ihuoma Frances
 * Matric No : 25/18081
 * Programme : Computer Science
 *
 * Purpose: Reads an item name, the quantity bought and the unit price,
 * then prints a purchase summary showing the total cost in Naira (NGN).
 *
 * Week 3 concepts used:
 *   - String, int and double variables
 *   - the expression  totalCost = quantity * unitPrice
 *     (Java automatically converts the int quantity to a double here)
 *   - Scanner input: nextLine(), nextInt() and nextDouble()
 *   - formatted output: %,.2f adds thousands separators and 2 decimals
 *
 * Validation: the quantity must be a whole number of at least 1, and the
 * unit price cannot be negative.
 */
public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== ITEM COST CALCULATOR ===");

        // Item name (nextLine allows names with spaces, e.g. "Exercise Book")
        System.out.print("Enter item name: ");
        String itemName = input.hasNextLine() ? input.nextLine().trim() : "";
        if (itemName.isEmpty()) {
            System.out.println("Invalid input: item name cannot be empty.");
            input.close();
            return;
        }

        // Quantity comes before unit price
        System.out.print("Enter quantity: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input: quantity must be a whole number.");
            input.close();
            return;
        }
        int quantity = input.nextInt();
        if (quantity <= 0) {
            System.out.println("Invalid quantity: quantity must be at least 1.");
            input.close();
            return;
        }

        // Unit price
        System.out.print("Enter unit price (NGN): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input: unit price must be a number.");
            input.close();
            return;
        }
        double unitPrice = input.nextDouble();
        if (unitPrice < 0) {
            System.out.println("Invalid price: unit price cannot be negative.");
            input.close();
            return;
        }

        // Calculation
        double totalCost = quantity * unitPrice;

        // Output
        System.out.println();
        System.out.println("========= PURCHASE SUMMARY =========");
        System.out.println("Item        : " + itemName);
        System.out.println("Quantity    : " + quantity);
        System.out.printf("Unit Price  : NGN %,.2f%n", unitPrice);
        System.out.printf("Total Cost  : NGN %,.2f%n", totalCost);
        System.out.println("====================================");

        input.close();
    }
}
