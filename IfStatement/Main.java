import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        System.out.println("Do you have the heartatrtack?");
        boolean isHeartAttack = scanner.nextBoolean();

        if (age > 18 && !isHeartAttack) {
            System.out.println("You are allow to enter the main event");
        }

        if (age < 18 || isHeartAttack) {
            System.out.println("You are not allow to enter the main event");
        }

        scanner.close();
    }
}
