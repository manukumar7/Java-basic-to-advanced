import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is Positive");

        } else if (number < 0) {
            System.out.println(number + " is Negative");

        } else {
            System.out.println("Number is Zero");
        }

        // Release the Scanner resource
        sc.close();
    }
}
