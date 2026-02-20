class Main {
    static void add(int a, int b){
        System.out.println("Sum of 2 numbers: " + (a + b));
    }
    static void add(int a, int b, int c){
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
    public static void main(String[] args) {
        add(10, 20);
        add(5, 6, 7);
    }
}