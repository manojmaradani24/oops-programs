class Parent {
    void display() {
        System.out.println("Parent method called");
    }
}
class Child extends Parent {
    void callParent() {
        display();
    }
}
class AccessParentMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.callParent();
    }
}