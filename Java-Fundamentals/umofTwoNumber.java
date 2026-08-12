import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take first number as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Take second number as input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum of two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum: " + sum);

        // Close Scanner
        sc.close();
    }
}
