class PassThis {
    int n = 100;
    void show(PassThis obj) {
        System.out.println(obj.n);
    }
    void call() {
        show(this);
    }
    public static void main(String[] args) {
        PassThis p = new PassThis();
        p.call();
    }
}