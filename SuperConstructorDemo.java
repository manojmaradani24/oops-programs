class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor called");
    }
}
class SuperConstructorDemo {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}