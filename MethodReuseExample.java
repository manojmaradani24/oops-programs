class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator {
    int square(int n) {
        return n * n;
    }
}
class MethodReuseExample {
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();
        int sum = obj.add(10, 20);
        int sq = obj.square(5);
        System.out.println("Sum = " + sum);
        System.out.println("Square = " + sq);
    }
}