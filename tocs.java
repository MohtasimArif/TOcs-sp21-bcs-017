import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square of the number
        double square = number * number;

        // Display the result
        System.out.println("The square of " + number + " is: " + square);

        // Close the scanner
        scanner.close();
    }
}
