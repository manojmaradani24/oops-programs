class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if(this.id == s.id && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }
}
public class StudentEquals {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manoj");
        Student s2 = new Student(101, "Manoj");
        System.out.println(s1.equals(s2));
    }
}