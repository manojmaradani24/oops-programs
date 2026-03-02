interface Father {
    void property();
}
interface Mother {
    void gold();
}
public class MultipleInterfaceDemo implements Father, Mother {
    public void property() {
        System.out.println("Father property");
    }
    public void gold() {
        System.out.println("Mother gold");
    }
    public static void main(String[] args) {
        MultipleInterfaceDemo obj = new MultipleInterfaceDemo();
        obj.property();
        obj.gold();
    }
}