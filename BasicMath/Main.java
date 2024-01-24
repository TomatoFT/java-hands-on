import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Next y: ");
        int y = scanner.nextInt();

        System.out.println(Math.sqrt((x*x)+(y*y)));
        scanner.close();
    }
}