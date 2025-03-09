package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
/*
        // for loop
        double totalCost = 0;
        double[] prices = {10.5, 20.5, 30.5, 40.5};

        for (int i = 0; i < prices.length; i++) {
            totalCost += prices[i];
        }

        System.out.println("Total Cost: $" + totalCost);
*/

/*
        // while loop
        int attempts = 0;
        String correctPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = scanner.nextLine();
            if (input.equals(correctPassword)) {
                System.out.println("Access Granted.");
                break;
            } else {
                System.out.println("Incorrect password.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Account locked due to too many failed attempts.");
        }
 */
/*
        // do-while

        int age;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your age (between 18 and 100): ");
            age = scanner.nextInt();
        } while (age < 18 || age > 100);

        System.out.println("Thank you! Age recorded as: " + age);
*/
/*
        // enhanced for loop
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
*/
/*
        double totalCost = 0;
        double[] prices = {10.5, 20.5, 30.5, 40.5};

        for (double price : prices) {
            totalCost += price;
        }

        System.out.println("Total Cost: $" + totalCost);

*/

    }
}
