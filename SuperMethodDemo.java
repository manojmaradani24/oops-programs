class Parent {
    void display() {
        System.out.println("This is Parent display method");
    }
}
class Child extends Parent {
    void display() {
        super.display();
        System.out.println("This is Child display method");
    }
}
class SuperMethodDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}