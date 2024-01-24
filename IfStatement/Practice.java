import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your age: ");
        int age = scanner.nextInt();

        if(age < 12) {
            System.out.println("You are still the kid");
        }
        else {
            if(age > 18) {
                System.out.println("You are adult");
            }
            else {
                System.out.println("You are teenager");
            }
        }
        scanner.close();
    }
}