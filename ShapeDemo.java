abstract class Shape {
    abstract void draw();
    void info() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        s1.info();
        Shape s2 = new Rectangle();
        s2.draw();
        s2.info();
    }
}