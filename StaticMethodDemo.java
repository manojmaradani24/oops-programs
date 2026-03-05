class Calculation {
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
public class StaticMethodDemo {
    public static void main(String[] args) {
        Calculation.add(10, 20);
    }
}