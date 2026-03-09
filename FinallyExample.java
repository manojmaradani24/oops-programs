public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        } 
        finally {
            System.out.println("Finally block always executes");
        }
        System.out.println("End of program");
    }
}