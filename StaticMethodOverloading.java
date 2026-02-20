class Main {
    static void print(int a){
        System.out.println("Value is: " + a);
    }
    static void print(String s){
        System.out.println("Value is: " + s);
    }
    public static void main(String[] args) {
        print(100);
        print("Hello");
    }
}