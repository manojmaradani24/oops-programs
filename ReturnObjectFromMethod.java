class Main {
    static class Student {
        int id;
        String name;
    }
    static Student getStudent() {
        Student s = new Student();
        s.id = 5;
        s.name = "Kiran";
        return s;
    }
    public static void main(String[] args) {
        Student s1 = getStudent();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}