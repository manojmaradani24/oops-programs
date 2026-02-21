class Parent {
    void print() {
        System.out.println("Print method in Parent");
    }
}
class Child extends Parent {
    @Override
    void print() {
        System.out.println("Print method in Child");
    }
}
class OverrideAnnotationDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}