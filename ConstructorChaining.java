class ConstructorChaining {
    ConstructorChaining() {
        System.out.println("default");
    }
    ConstructorChaining(int n) {
        this();
        System.out.println(n);
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining(10);
    }
}