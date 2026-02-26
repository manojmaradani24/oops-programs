abstract class Bank {
    abstract void getInterestRate();
    void bankInfo() {
        System.out.println("Welcome to Bank");
    }
}
class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate is 6%");
    }
}
class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate is 7%");
    }
}
class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.getInterestRate();
        b1.bankInfo();
        Bank b2 = new HDFC();
        b2.getInterestRate();
        b2.bankInfo();
    }
}