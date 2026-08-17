import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            // If remainder is 0, the number is even
            System.out.println(number + " is Even");
        } else {
            // If remainder is not 0, the number is odd
            System.out.println(number + " is Odd");
        }

        // Close the Scanner
        sc.close();
    }
}
