import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

    private static void datatype() {
        int x = 123;
        double pi = 3.14;
        float y = 3.133f;
        boolean isYes = true;
        String name = "Hello";
        char symbol = '@';

        System.out.println(x);
        System.out.println(pi);
        System.out.println(y);
        System.out.println(isYes);
        System.out.println(name);
        System.out.println(symbol);
    }

    private static void calculation() {
        int x = 123;
        int y = 456; 
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
    }

    private static void swap() {
        String temp;
        String a="Xin Chao";
        String b="Hello";
        System.out.println("String A: "+ a);
        System.out.println("String B: "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("String A: "+ a);
        System.out.println("String B: "+ b);
    }

    private static void random() {
        Random random = new Random();
        double x = random.nextDouble();
        System.out.println(x);
    }

    private static void printInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live?");
        String place = scanner.nextLine();
        System.out.println("Which grade are you in?");
        int grade = scanner.nextInt();

        System.out.println("Hello "+name+" from "+place);
        System.out.println("You are in grade "+grade);

    }

    private static void arithmeticCalculation() {
        int x = 30;
        int y = 2;

        System.out.println("add: "+ (x+y) );
        System.out.println("minus: "+ (x-y) );
        System.out.println("multiply: "+(x*y));
        System.out.println("divided: "+x/y);
        System.out.println("modular: "+x%y);
        System.out.println("devide float: "+ (float)(x/y));
        System.out.println("increse: "+(x++));
    }

    private static void printMenu () {
        System.out.println("Choose option to pick: ");
        System.out.println("1. print Hello World");
        System.out.println("2. Calculation");
        System.out.println("3. Print Data Type");
        System.out.println("4. Swap Value");
        System.out.println("5. Print Input");
        System.out.println("6. ArithMetic Calculation");
        System.out.println("7. Print Random Number");

    }

    private static void printHelloWold() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        while(true) {
        printMenu();
        Scanner choice_scanner = new Scanner(System.in);        

        int choice = choice_scanner.nextInt();

        switch (choice) {
            case 1: printHelloWold(); break;
            case 2: calculation(); break;
            case 3: datatype(); break;
            case 4: swap(); break;
            case 5: printInput(); break;
            case 6: arithmeticCalculation(); break;
            case 7: random(); break;
        }
    }
    }
}

