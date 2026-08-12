import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user's name as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Take user's age as input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Take user's city as input
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        // Print the entered details
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Close Scanner
        sc.close();
    }
}
