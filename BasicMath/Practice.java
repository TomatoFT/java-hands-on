
public class Practice {
    private static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    private static int getMax(int a, int b) {
        return Math.max(a ,b);
    }

    private static int getAbs(int a) {
        return Math.abs(a);
    }
    private static double getSqrt(int a) {
        return Math.sqrt(a);
    }
    private static double getRound(double a) {
        return Math.round(a);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(getMin(a,b));
        System.out.println(getMax(a,b));
        System.out.println(getSqrt(4));

        System.out.println(getAbs(a));
        System.out.println(getRound(a));
    }
}