class StudentEncapsulation {
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Main {
    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation();
        s.setId(101);
        s.setName("Manoj");
        System.out.println("Id: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}