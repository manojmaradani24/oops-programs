class Parent {
    final void showMessage() {
        System.out.println("This is a final method in parent class");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}
public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();
        c.display();
    }
}