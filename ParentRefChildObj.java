class Parent {
    void display() {
        System.out.println("Display method in Parent");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Display method in Child");
    }
}
class ParentRefChildObj {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}