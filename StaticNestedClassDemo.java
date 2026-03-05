class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}