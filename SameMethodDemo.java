interface A {
    void show();
}
interface B {
    void show();
}
public class SameMethodDemo implements A, B {
    public void show() {
        System.out.println("Show method implemented once");
    }
    public static void main(String[] args) {
        SameMethodDemo obj = new SameMethodDemo();
        obj.show();
    }
}