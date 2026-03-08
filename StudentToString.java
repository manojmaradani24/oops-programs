class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}
public class StudentToString {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manoj");
        System.out.println(s1);
    }
}