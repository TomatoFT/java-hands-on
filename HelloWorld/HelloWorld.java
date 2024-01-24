import java.util.Scanner;

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
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        calculation();
        datatype();
        swap();
        // printInput();
        arithmeticCalculation();
    }
}

