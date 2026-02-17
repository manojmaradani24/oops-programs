class ThisInstance {
    int x;
    int y;
    ThisInstance(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void show() {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        ThisInstance obj = new ThisInstance(10, 20);
        obj.show();
    }
}