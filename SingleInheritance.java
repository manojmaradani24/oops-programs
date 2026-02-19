class Parent {
    void showParent() {
        System.out.println("This is parent class method");
    }
}
class Child extends Parent {
    void showChild() {
        System.out.println("This is child class method");
    }
}
class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
    }
}