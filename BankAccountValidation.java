class BankAccountValidation {
    private int balance;
    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }
    public int getBalance() {
        return balance;
    }
}
class Main {
    public static void main(String[] args) {
        BankAccountValidation b = new BankAccountValidation();
        b.setBalance(5000);
        System.out.println("Balance: " + b.getBalance());
        b.setBalance(-100);
        System.out.println("Balance: " + b.getBalance());
    }
}