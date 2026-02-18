class ReadOnlyEmployee {
    private int empId = 10;
    private String empName = "Rahul";
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
}
class Main {
    public static void main(String[] args) {
        ReadOnlyEmployee e = new ReadOnlyEmployee();
        System.out.println("Id: " + e.getEmpId());
        System.out.println("Name: " + e.getEmpName());
    }
}