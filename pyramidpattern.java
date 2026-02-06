
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" "); // Print a space, not a new line
            }

            // Inner loop to print numbers in ascending order
            int number = 1; // Initialize 'number' for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            // Inner loop to print numbers in descending order (for the right side of the pyramid)
            number = i - 1; // Start from (current row number - 1)
            for (int j = 1; j < i; j++) {
                System.out.print(number + " ");
                number--;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}