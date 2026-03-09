class ReturnThis {
    int x = 50;
    ReturnThis get() {
        return this;
    }
    void print() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        ReturnThis r = new ReturnThis();
        ReturnThis r2 = r.get();
        r2.print();
    }
}