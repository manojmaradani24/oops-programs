class ThisConstructor {
    int a;
    int b;
    ThisConstructor() {
        a = 5;
        b = 10;
    }
    ThisConstructor(int x, int y) {
        this();
        a = a + x;
        b = b + y;
    }
    void print() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        ThisConstructor obj = new ThisConstructor(3, 4);
        obj.print();
    }
}