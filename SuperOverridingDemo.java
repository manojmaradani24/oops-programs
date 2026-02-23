class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}
class Child extends Parent {
    @Override
    void greet() {
        super.greet();
        System.out.println("Hello from Child");
    }
}
class SuperOverridingDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.greet();
    }
}