class Parent {
    void show() {
        System.out.println("This is parent show method");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("This is child show method");
    }
}
class OverrideMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}