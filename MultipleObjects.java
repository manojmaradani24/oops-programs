class Main {
    static class Student {
        int id;
        String name;
        void display() {
            System.out.println(id + " " + name);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "A";
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "B";
        s1.display();
        s2.display();
    }
}