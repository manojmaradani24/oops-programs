class ParameterizedConstructor {
    int n;
    ParameterizedConstructor(int a) {
        n = a;
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(5);
        System.out.println(obj.n);
    }
}