interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
public class PrinterScannerDemo implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }
    public void scan() {
        System.out.println("Scanning...");
    }
    public static void main(String[] args) {
        PrinterScannerDemo obj = new PrinterScannerDemo();
        obj.print();
        obj.scan();
    }
}