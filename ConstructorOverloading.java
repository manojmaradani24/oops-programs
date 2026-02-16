class ConstructorOverloading {
    int a;
    int b;
    ConstructorOverloading() {
        a = 0;
        b = 0;
    }
    ConstructorOverloading(int x, int y) {
        a = x;
        b = y;
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(2, 3);
        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
}