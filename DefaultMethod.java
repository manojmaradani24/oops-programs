interface Laptop {
    default void brand() {
        System.out.println("Brand is HP");
    }
    void price();
}
class HP implements Laptop {
    public void price() {
        System.out.println("Price is 55000");
    }
    public static void main(String[] args) {
        HP h = new HP();
        h.brand();
        h.price();
    }
}