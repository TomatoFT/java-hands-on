package Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("D")) {
            System.out.println("Help me! I am stuck in the while loop. Click D to save me");
            choice = scanner.next(); // Read the user input
        }
        System.out.println("Thank you for saving me");
        scanner.close();
    }
}
