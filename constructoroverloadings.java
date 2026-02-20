class Main {
    Main(){
        System.out.println("Default constructor called");
    }
    Main(int a){
        System.out.println("Constructor with one argument: " + a);
    }
    Main(int a, int b){
        System.out.println("Constructor with two arguments: " + (a + b));
    }
    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main(10);
        Main obj3 = new Main(5, 6);
    }
}