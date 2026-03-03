interface A {
    default void show() {
        System.out.println("From Interface A");
    }
}
interface B {
    default void show() {
        System.out.println("From Interface B");
    }
}
public class DiamondProblemDemo implements A, B {
    public void show() {
        System.out.println("Diamond problem solved");
    }
    public static void main(String[] args) {
        DiamondProblemDemo obj = new DiamondProblemDemo();
        obj.show();
    }
}