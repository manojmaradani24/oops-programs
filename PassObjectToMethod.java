class Main {
    static class Student {
        int id;
        String name;
    }
    static void printStudent(Student s) {
        System.out.println(s.id);
        System.out.println(s.name);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 10;
        s.name = "Rahul";
        printStudent(s);
    }
}