class WriteOnlyUser {
    private String password;
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password set successfully");
    }
}
class Main {
    public static void main(String[] args) {
        WriteOnlyUser u = new WriteOnlyUser();
        u.setPassword("mypassword123");
    }
}