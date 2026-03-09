interface Father {
    void fatherProperty();
}InterfaceReference.java
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Father has land");
    }
    public void motherProperty() {
        System.out.println("Mother has gold");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.fatherProperty();
        c.motherProperty();
    }
}