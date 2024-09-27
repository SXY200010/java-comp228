public class OverloadedMethods {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(3, 6, 9));
        System.out.println("Sum of two doubles: " + add(4.5, 7.8));
    }
}
