public class Exp8_Q3 {
    public static void main(String[] args) {
          System.out.println("nitish gupta,24csu330");
        try {

            // Throwing an exception with string argument
            throw new Exception("This is a test exception message!");
        } 
        catch (Exception e) {
            // Catching and printing the string argument
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            // Finally clause
            System.out.println("Finally block executed — we were here!");
        }
    }
}