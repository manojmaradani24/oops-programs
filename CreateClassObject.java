class Main {
    static class Student {
        int id;
        String name;
        void display() {
            System.out.println(id);
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "manoj";
        s.display();
    }
}