class Student {
    int id;
    String name;
    static String college = "VIT";
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
public class StaticVariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Manoj");
        Student s2 = new Student(2, "Rahul");
        s1.display();
        s2.display();
    }
}