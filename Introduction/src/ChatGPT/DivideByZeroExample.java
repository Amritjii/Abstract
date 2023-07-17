package ChatGPT;

public class DivideByZeroExample {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        
        try {
            int result = dividend / divisor; // This will raise an ArithmeticException
            System.out.println("Result: " + result);
        }  catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the exception here
        }
    }
}